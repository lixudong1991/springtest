package com.myspring.factory;

import com.myspring.beans.User;

/**
 * Created by Tomcat on 2017/9/18.
 */
public class UserFactory {
    public static User getUser(){
        return new User();
    }
}
