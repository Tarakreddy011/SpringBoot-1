package com.tarak.demo.studentserver.controller;

import com.tarak.demo.studentserver.entity.Student;
import com.tarak.demo.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create the student
    @PostMapping("/addstudent")
    public ResponseEntity<?> storeStudent(@RequestBody Student student) {
        Student result = studentService.StudentValidate(student);

        if (result == null) {
            return ResponseEntity.status(400).body("Invalid data");
        }
        return ResponseEntity.status(201).body(result);
    }


    /**
     * <?> this symbol is used for
     */

    @GetMapping("/getstudent/{id}")
    public ResponseEntity<?> getStudentBy(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }
}
