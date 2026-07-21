package com.tarak.demo.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


@Entity
public class Manager {

    @Id
    @GeneratedValue
    int id;

    String name;

    String managerstorename;

    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerstorename() {
        return managerstorename;
    }

    public void setManagerstorename(String managerstorename) {
        this.managerstorename = managerstorename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
