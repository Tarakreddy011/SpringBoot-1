package com.tarak.demo.studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

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

    @GetMapping("/getstudent")
    public List<Student> getStudents() {
        Student result = studentService.StudentValidate(null);

        if (result == null) {
            return Collections.emptyList();
        }
        return studentService.getAllStudents();
    }
}
