package com.tarak.demo.studentserver;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {


    @Id
    int id;
    int age;
    String name;
    String depertment;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        id = id;
    }

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
