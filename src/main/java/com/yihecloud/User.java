package com.yihecloud;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2017-05-05
 * Copyright 青海粮食云项目组
 */
public class User {

    private String id;

    private String name;

    private int age;

    public User(){}

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
