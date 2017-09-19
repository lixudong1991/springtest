package com.myspring.aoptarget;

/**
 * Created by Tomcat on 2017/9/19.
 */
public class AopTarget {
    public void say(){
        System.out.println("say");
    }
    public void sayWithAnnoAspect(){
        System.out.println("sayWithAnnoAspect");
    }
}
