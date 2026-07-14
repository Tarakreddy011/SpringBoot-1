package com.tarak.demo.studentserver;

public class Student {

    public int getid() {
        return id;
    }

    public void setid(int id) {
        id = id;
    }

    int id;
    int age;
    String name;
    String depertment;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }


}
