package com.myspring.anno;

import org.springframework.stereotype.Service;

/**
 * Created by Tomcat on 2017/9/18.
 */
@Service
public class Techer {
    public String name="techer";
    public int classid=2;
    @Override
    public String toString() {
        return "Techer{" +
                "name='" + name + '\'' +
                ", classid=" + classid +
                '}';
    }
}
