package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandler {

    @AfterThrowing(pointcut="execution(* com.example..*.*(..))", throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
        System.out.println("***************** Exception" + ex.getMessage());
    }
}
