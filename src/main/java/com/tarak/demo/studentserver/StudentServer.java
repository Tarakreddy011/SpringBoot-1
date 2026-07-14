package com.tarak.demo.studentserver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1 . create the student
 * 2 . Read the student
 * 3 . Update the server
 * 4 . Delete the server
 */

@RestController
public class StudentServer {


    // create the student
    @PostMapping("/addstudent")
    public String storeStudent(@RequestBody Student student) { // it convert json to class to stote in class

        int id = student.getid();
        int age = student.getAge();
        String name = student.getName();
        String depertment = student.getDepertment();
        return "id : " + id +
                ", name : " + name +
                ", age : " + age +
                ", deperment : " + depertment;
    }

    // Read the student data

}
