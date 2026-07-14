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
    String Name;
    String Depertment;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepertment() {
        return Depertment;
    }

    public void setDepertment(String depertment) {
        Depertment = depertment;
    }


}
