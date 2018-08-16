package com.caody.muyi.core.aop;

import com.caody.muyi.core.asyncTask.MyAsyncTask;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Aspect
@Component
public class TestAop {

    @Autowired
    private MyAsyncTask myAsyncTask;

    private final static Logger logger = LoggerFactory.getLogger(TestAop.class);

    @Pointcut("execution(public * com.caody.muyi.TestController.aopTest())")
    public void testAop(){};


    @After("testAop()")
    public void after(){

        String aaa = "执行完主体方法以后才会执行的方法";
        Future<String> task  = myAsyncTask.refreshMyDbAsync();
        logger.info(aaa);
    }



}
