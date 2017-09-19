package com.myspring.beans;


import java.util.*;

/**
 * Created by Tomcat on 2017/9/18.
 */
public class Friends {
    private List<String> list;
    private Map<Integer, String> map;
    private Set<Test> set;
    private Test[] tests;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public Set<Test> getSet() {
        return set;
    }

    public void setSet(Set<Test> set) {
        this.set = set;
    }

    public Test[] getTests() {
        return tests;
    }

    public void setTests(Test[] tests) {
        this.tests = tests;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "\nlist=" + list +
                "\nmap=" + map +
                "\nset=" + set +
                "\ntests=" + Arrays.toString(tests) +
                "\nproperties=" + properties +
                '}';
    }
}
