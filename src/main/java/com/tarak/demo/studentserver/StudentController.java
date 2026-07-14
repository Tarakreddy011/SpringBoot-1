package com.tarak.demo.studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create the student
    @PostMapping("/addstudent")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student) {
        Student result = studentService.StudentValidate(student);

        if (result == null) {
            return ResponseEntity.status(400).body(result);
        }
        return ResponseEntity.status(201).body(result);
    }
}
