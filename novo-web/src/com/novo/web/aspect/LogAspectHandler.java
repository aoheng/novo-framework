package com.novo.web.aspect;

import com.novo.commons.support.logserver.protocol.TaskLogRequestProtocol;
import com.novo.framework.core.protocol.BaseResponseProtocol;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LogAspectHandler {

    private static final Logger logger = LoggerFactory.getLogger(LogAspectHandler.class);
    private static final String defualt_callerId = "0";
    private static final String defualt_Type = "cloud application";
    ThreadLocal<Long> time = new ThreadLocal<Long>();
    ThreadLocal<TaskLogRequestProtocol> taskLogThread = new ThreadLocal<TaskLogRequestProtocol>();
    @Value("${spring.application.name}")
    private String applicationName;

    @Pointcut("@annotation(com.novo.framework.core.log.LogPointcut)")
    public void logPointcut() {
    }


    @Before("logPointcut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        time.set(System.currentTimeMillis());
//        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
//        Method method = ms.getMethod();
//        Object[] args = joinPoint.getArgs();
//        if (args == null || args.length == 0) {
//            return;
//        }
//        Object targetArg = null;
//        for (Object arg : args) {
//            if (arg instanceof RequestProtocol) {
//                targetArg = arg;
//                break;
//            }
//        }
//        if (targetArg == null) {
//            return;
//        }
//
//        TaskLogRequestProtocol taskLog = null;
//        try {
//            taskLog = SuperJson.readValue(targetArg, TaskLogRequestProtocol.class, new String[]{
//                    Entity.base_field_id, Entity.base_field_createTime, Entity.base_field_updateTime, Entity.base_field_isDelete});
//        } catch (Exception e) {
//            return;
//        }
    	/*taskLog.setId(null);
    	taskLog.setCreateTime(null);
    	taskLog.setUpdateTime(null);
    	taskLog.setIsDelete(null);*/

//        String serverName = method.getAnnotation(LogPointcut.class).server();
//        if (serverName == null || serverName.equals("")) {
//            serverName = applicationName;
//        }
//        taskLog.setCloudServiceName(serverName);
//        taskLog.setLogLevel(method.getAnnotation(LogPointcut.class).logLevel());
//        taskLog.setStartTime(new Date(time.get()));
//        if (taskLog.getServiceName() == null || taskLog.getServiceName().equals("")) {
//            taskLog.setServiceName(method.getName());
//        }
//        taskLog.setTargetServiceName(taskLog.getServiceName());
//
//        taskLog.setRequestProtocol(targetArg.toString());
//        if (taskLog.getCallerId() == null) {
//            taskLog.setCallerId(defualt_callerId);
//            taskLog.setCallerType(defualt_Type);
//        }
//        if (taskLog.getTaskId() == null) {
//            taskLog.setTaskId(UUID.randomUUID().toString().replaceAll("-", ""));
//        }
//
//        taskLog.setInvokeMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//        HttpServletRequest request = RequestContextHolder.getRequestAttributes() != null ?
//                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() : null;
//        if (request != null) {
//            if (request.getAttribute("taskId") != null) {
//                taskLog.setTaskId(request.getAttribute("taskId").toString());
//            }
//            if (request.getAttribute("callerId") != null) {
//                taskLog.setCallerId(request.getAttribute("callerId").toString());
//            }
//            if (request.getAttribute("callerType") != null) {
//                taskLog.setCallerType(request.getAttribute("callerType").toString());
//            }
//        }
//        taskLogThread.set(taskLog);

    }

    /* @Around("logPointcut()")
     public void aroundExec(ProceedingJoinPoint pjp) throws Throwable{
         pjp.proceed();
     }*/
    @AfterReturning(pointcut = "logPointcut()", returning = "protocol")
    public void afterReturningAdvice(BaseResponseProtocol<?> protocol) {
//        TaskLogRequestProtocol taskLog = taskLogThread.get();
//        if (taskLog == null) {
//            return;
//        }
//        long endTime = System.currentTimeMillis();
//        taskLog.setEndTime(new Date(endTime));
//        taskLog.setLifeCycle(endTime - time.get());
//        BaseResponseProtocol<String> responseProtocol = new BaseResponseProtocol<String>();
//        responseProtocol.setCode(protocol.getCode());
//        responseProtocol.setIsSuccess(protocol.getIsSuccess());
//        responseProtocol.setMessage(protocol.getMessage());
//        taskLog.setResponseProtocol(responseProtocol.toString());
//        logServer.taskRecord(taskLog);

    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


}
