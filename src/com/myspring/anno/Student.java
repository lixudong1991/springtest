package com.myspring.anno;

import com.myspring.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Tomcat on 2017/9/18.
 */
@Component(value = "student") //@Controller @Service @Repository @Component这几个注解类似，都是创建对象的
//@Scope(value = "")设置对象是单例模式或多例模式
public class Student {
    @Resource(name = "user1")
    private User user;
    @Resource(name="cla")
    private Cla cla;
    @Autowired
    private Techer techer;

    @Override
    public String toString() {
        return "Student{" +
                "user=" + user +
                ", cla=" + cla +
                ", techer=" + techer +
                '}';
    }
}
