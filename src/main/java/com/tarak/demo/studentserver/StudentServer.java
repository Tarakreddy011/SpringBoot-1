package com.tarak.demo.studentserver;

import org.springframework.web.bind.annotation.PostMapping;
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
    public String storeStudent(){
        return """
                Id : 001,
                Name: Tarak,
                Depertment: CSE,
                age: 20
                """;
    }

    // Read the student data

}
