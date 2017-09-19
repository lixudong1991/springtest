package com.myspring.test;

import com.myspring.anno.Student;
import com.myspring.aoptarget.AopTarget;
import com.myspring.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tomcat on 2017/9/18.
 */
public class SpringTest {
    ApplicationContext applicationContext;

    @Before
    public void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("AppCon.xml");
    }

    @Test
    public void getBeanByConstruct() {
        User user = (User) applicationContext.getBean("user1");
        System.out.println(user);
    }

    @Test
    public void getBeanByFactoryStaticMethod() {
        User user = (User) applicationContext.getBean("user3");
        System.out.println(user);
    }
    @Test
    public void getBeanByAnno() {
        Student user = (Student) applicationContext.getBean("student");
        System.out.println(user);

    }
    @Test
    public void AopTest() {
        AopTarget target = (AopTarget) applicationContext.getBean("aTarget");
        target.say();
    }
    @Test
    public void AopAnnoTest() {
        AopTarget target = (AopTarget) applicationContext.getBean("aTarget");
        target.sayWithAnnoAspect();
    }
}
