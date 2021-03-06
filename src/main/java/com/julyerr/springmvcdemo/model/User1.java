package com.julyerr.springmvcdemo.model;

import java.io.Serializable;
import java.util.Date;

public class User1 implements Serializable {
    /**
     * @author zjn
     */
    private static final long serialVersionUID = 1L;
    private Integer id; // id
    private String name; // name
    private String pwd; // pwd
    private Integer age; // age
    private Date creatTime; // creatTime

    public User1(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

}
