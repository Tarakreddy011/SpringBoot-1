package com.tarak.demo.store;



public class CreateStoreRequestDTO {
    private String name;
    private int age;
    private String email;
    private int phone;

    // Generate Getters and Setters for all fields
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getPhone() { return phone; }
    public void setPhone(int phone) { this.phone = phone; }
}