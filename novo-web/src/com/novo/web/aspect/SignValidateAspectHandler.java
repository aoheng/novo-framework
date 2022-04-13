package com.novo.web.aspect;

import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.ResponseMessage;
import com.novo.framework.core.reflect.FieldUtil;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/**
 * 签名校验切面
 * @Author: 奥亨[aoheng.ke@tuya.com]
 * @Date: 2020/12/29 15:57
 */
@Aspect
@Configuration
public class SignValidateAspectHandler {

    private static Logger logger = LoggerFactory.getLogger(SignValidateAspectHandler.class);
    /**
     * 时间戳请求最小限制(30s)
     * 设置的越小，安全系数越高，但是要注意一定的容错性
     */
    private long MAX_REQUEST=30*1000L;

    @Pointcut("@annotation(com.novo.framework.core.sign.SignValidate)")
    public void signValidatePointcut() {

    }

    //(前置通知)
    @Before("signValidatePointcut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        MethodSignature ms=(MethodSignature) joinPoint.getSignature();
        Method method=ms.getMethod();
        Object[] args = joinPoint.getArgs();
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        if(args == null || args.length == 0) {
            throw new CustomException(ResponseMessage.CODE_PARAM_ERROR);
        }
        Object targetArg=null;
        for(Object arg : args) {
            if( arg instanceof RequestProtocol) {
                targetArg = arg;
                break;
            }
        }
        if(targetArg == null) {
            throw new CustomException(ResponseMessage.CODE_PARAM_ERROR);
        }
        try {
            Map<String, Field> requestParams = FieldUtil.getAllFieldMap(targetArg.getClass());
            //验证签名
            Boolean flag=checkSign(request,requestParams);
            if (!flag) {
                throw new CustomException(ResponseMessage.CODE_SIGN_ERROR);
            }
            //记录日志
        } catch (Throwable e) {
            logger.error("sign error:{}",e);
            throw new CustomException(ResponseMessage.CODE_SIGN_ERROR);
        }


    }

    private Boolean checkSign(HttpServletRequest request, Map<String, Field> requestParams) {
        String appId = request.getHeader("appId");
        String sign = request.getHeader("sign");
        String timestamp = request.getHeader("timestamp");
        if (StringUtils.isAnyBlank(sign, timestamp)) {
            throw new CustomException(ResponseMessage.CODE_PARAM_ERROR);
        }
        long now = System.currentTimeMillis();
        long time = Long.parseLong(timestamp);
        if (now - time > MAX_REQUEST) {
            logger.error("时间戳已过期now[{}]-timestamp[{}]=[{}]", now, time, (now - time));
            throw new CustomException(ResponseMessage.TIME_STAMP_TIME_OUT_ERROR);
        }
        //校验appId是否已配置（可写到配置后台，实现动态管理，由于流量大，建议添加redis缓存）

        //校验签名字段，根据appID和appSecret对比参与签名


        return true;
    }


}
