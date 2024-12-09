package org.edu.miu.cs.cs544.labw2d6.aspects;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@EnableAspectJAutoProxy
public class Logger implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getSimpleName() + " is running");
    }
}
