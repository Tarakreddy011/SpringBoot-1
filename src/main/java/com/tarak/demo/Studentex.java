package com.tarak.demo;

import org.springframework.stereotype.Component;

@Component
public class Studentex {
    private String name;
    private int age;

    public Studentex() {

    }

    public Studentex(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * this is new comment

     */

    void display(){
        //System.out.println(this.name);
        System.out.println(getName());
        //System.out.println(this.age);
        System.out.println(getAge());
    }
}
