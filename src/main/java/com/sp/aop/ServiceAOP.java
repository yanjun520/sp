package com.sp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAOP {

    @Pointcut("execution(* com.sp.service..*.*(..))")
    private void pointCutMethod() {
    }
    
    @Before("pointCutMethod()")
    public void doBefore() {
        System.out.println("#aop before");
    }
    
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("#aop around before");
        Object obj = pjp.proceed();
        System.out.println("#aop around after");
        System.out.println("#aop around obj: " + obj.toString());
        obj = "LALALA";
        return obj;
    }
    
    @AfterReturning("pointCutMethod()")
    public void doAfterReturning() {
        System.out.println("#aop after returning");
    }
    
    @AfterThrowing("pointCutMethod()")
    public void doAfterException() {
        System.out.println("#aop after exception");
    }
    
    @After("pointCutMethod()")
    public void after() {
        System.out.println("#aop after");
    }
    
}
