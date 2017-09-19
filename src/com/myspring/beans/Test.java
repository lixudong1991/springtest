package com.myspring.beans;

/**
 * Created by Tomcat on 2017/9/18.
 */
public class Test {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Test.s='" + s + '\'';
    }
}
