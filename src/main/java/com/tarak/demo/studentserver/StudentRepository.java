package com.tarak.demo.studentserver;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {


    public Student save(Student student) {

        System.out.println("StudentRepository save");
        return student;
    }
}
