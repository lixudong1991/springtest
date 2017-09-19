package com.myspring.beans;

import java.util.Date;

/**
 * Created by Tomcat on 2017/9/18.
 */
public class User {
    private String name;
    private String pass;
    private Date date;
    private int money;
    private Friends friends;

    public User() {
    }

    public User(String name, String pass, Date date, int money, Friends friends) {
        this.name = name;
        this.pass = pass;
        this.date = date;
        this.money = money;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", date=" + date +
                ", money=" + money +
                ", friends=" + friends +
                '}';
    }
}
