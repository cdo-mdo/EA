package org.edu.miu.cs.cs544.labw2d6.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

    @After("execution(* org.edu.miu.cs.cs544.labw2d6.assignment_2.Car.move(..))")
    public void afterMove(JoinPoint joinPoint) {
        System.out.println("After :" + joinPoint.getSignature().getDeclaringTypeName() +
        " : " + joinPoint.getSignature().getName());
    }
}
