package org.edu.miu.cs.cs544.vrs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Define a pointcut for all methods in the service layer
    @Pointcut("execution(* org.edu.miu.cs.cs544.vrs.service..*(..))")
    public void serviceLayer() {}

    // Before advice: Log method entry with arguments
    @Before("serviceLayer()")
    public void logMethodEntry(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Entering method: {} with arguments: {}", methodName, args);
    }

    // After advice: Log method execution completion
    @After("serviceLayer()")
    public void logMethodExit(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Exiting method: {}", methodName);
    }

    // Around advice: Measure execution time
    @Around("serviceLayer()")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - startTime;
        logger.info("Method {} executed in {} ms", proceedingJoinPoint.getSignature().getName(), elapsedTime);
        return result;
    }
}
