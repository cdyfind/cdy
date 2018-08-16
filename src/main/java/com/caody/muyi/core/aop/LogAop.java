package com.caody.muyi.core.aop;

import com.caody.muyi.mogodb.LogError;
import com.caody.muyi.mogodb.OperationLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
@Slf4j
public class LogAop {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Pointcut("execution(public * com.caody.muyi.controller.*.*(..))")
    public void logAop(){};

    @Before("logAop()")
    public void around(JoinPoint joinPoint){
        log.info("user:cdy");
        log.info("time:"+new Date());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature
                ().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

        OperationLog operationLog = new OperationLog();
        operationLog.setLogname("cdy");
        operationLog.setLogtype("业务日志");
        operationLog.setCreatetime(new Date());
        operationLog.setUserid(1);
        operationLog.setClassname(joinPoint.getSignature().getDeclaringTypeName());
        operationLog.setMethod(joinPoint.getSignature().getName());
        operationLog.setSucceed("成功");
        operationLog.setMessage("");
        mongoTemplate.save(operationLog);
    }

//    @AfterReturning(returning = "object", pointcut = "logAop()")
//    public void after(Object object){
//        System.out.println(object);
//        log.info("RESPONSE : " + object);
//    }

    @AfterThrowing(pointcut = "logAop()", throwing="e")
    public  void  afterThrowing(JoinPoint joinPoint, Throwable e){
        log.info("user:cdy");
        log.info("time:"+new Date());
        log.info("path : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature
                ().getName());
        log.info("param : " + Arrays.toString(joinPoint.getArgs()));
        log.info("异常代码:" + e.getClass().getName());
        log.info("异常信息:" + e.getMessage());

        OperationLog operationLog = new OperationLog();
        operationLog.setLogname("cdy");
        operationLog.setLogtype("异常日志");
        operationLog.setCreatetime(new Date());
        operationLog.setUserid(1);
        operationLog.setClassname(joinPoint.getSignature().getDeclaringTypeName());
        operationLog.setMethod(joinPoint.getSignature().getName());
        operationLog.setSucceed("失败");
        operationLog.setMessage(e.getMessage());
        mongoTemplate.save(operationLog);

    }

}
