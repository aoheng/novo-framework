package com.novo.web.aspect;

import com.novo.framework.core.exception.CustomException;
import com.novo.framework.core.exception.NullFieldException;
import com.novo.framework.core.protocol.RequestProtocol;
import com.novo.framework.core.protocol.ResponseMessage;
import com.novo.framework.core.reflect.FieldUtil;
import com.novo.framework.core.reflect.InvokeMethod;
import com.novo.framework.core.web.vaild.RequestVaild;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

@Aspect
@Configuration
public class RequestVaildAspectHandler {
//	private static Logger logger = LoggerFactory.getLogger(RequestVaildAspectHandler.class);
	@Pointcut("@annotation(com.novo.framework.core.web.vaild.RequestVaild)")
    public void requestVaildPointcut() {
    }

    @Before("requestVaildPointcut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
    	MethodSignature ms=(MethodSignature) joinPoint.getSignature();
        Method method=ms.getMethod();
        String[] vaildFields = method.getAnnotation(RequestVaild.class).vaildFields();
        Object[] args = joinPoint.getArgs();
        if(args == null || args.length == 0) {
        	return;
        }
    	Object targetArg = null;
    	for(Object arg : args) {
    		if( arg instanceof RequestProtocol) {
    			targetArg = arg;
    			break;
        	}
    	}
    	if(targetArg == null) {
    		return;
    	}
        Map<String,Field> requestParams = FieldUtil.getAllFieldMap(targetArg.getClass());
        for(String field : vaildFields) {
        	//logger.info("vaild method["+ms.getMethod()+"] field.........["+field+"]");
        	//System.out.println("vaild method["+ms.getMethod()+"] field.........["+field+"]");
        	if(requestParams.containsKey(field) == false) {
        		throw new CustomException("error","请求接口参数验证错误，验证字段["+field+"]不存在");
        	}
        	Object value = InvokeMethod.invokeGetter(targetArg, field);
        	if(value == null || value.toString().equals("")) {
        		throw new NullFieldException(field, ResponseMessage.CODE_FIELD_NOT_BE_NULL);
        	}
        }
        
    }

    

}
