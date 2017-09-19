package com.myspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Tomcat on 2017/9/19.
 */
@Aspect
public class AnnoAspect {
    @Before(value = "execution(* com.myspring.aoptarget.AopTarget.sayWithAnnoAspect(..))")
    public void annoBefore() {
        System.out.println("AnnoAspect before");

    }
    @AfterReturning("execution(* com.myspring.aoptarget.AopTarget.sayWithAnnoAspect(..))")
    public void annoAfterRet() {
        System.out.println("AnnoAspect after-returning");
    }
    @After("execution(* com.myspring.aoptarget.AopTarget.sayWithAnnoAspect(..))")
    public void annoAfter() {
        System.out.println("AnnoAspect after");
    }
    @Around("execution(* com.myspring.aoptarget.AopTarget.sayWithAnnoAspect(..))")
    public void annoAroundmethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AnnoAspect 环绕方法 前");
        proceedingJoinPoint.proceed();
        System.out.println("AnnoAspect 环绕方法 后");
    }
}
