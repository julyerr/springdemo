package com.julyerr.jdbcTemplate.model;

public class Student{
    private String ID;
    private String name;
    private int age;
    private String FM;

    public Student(){
    }

    public Student(String ID,String name,int age, String FM){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.FM = FM;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getID(){
        return this.ID;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public void setage(int age){
        this.age = age;
    }

    public int getage(){
        return age;
    }

    public void setFM(String FM){
        this.FM = FM;
    }

    public String getFM(){
        return this.FM;
    }

    public void display(){
        System.out.println(ID + " " + name + " " + age + " " + FM);
    }
}
