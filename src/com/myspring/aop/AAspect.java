package com.myspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Tomcat on 2017/9/19.
 */
public class AAspect {
    public void beforePointCut() {
        System.out.println("before");

    }

    public void afterRetPointCut() {
        System.out.println("after-returning");
    }
    public void afterPointCut() {
        System.out.println("after");
    }
    public void aroundmethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕方法 前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕方法 后");
    }
}
