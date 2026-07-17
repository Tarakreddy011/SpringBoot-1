package com.tarak.demo.studentserver.controller;

import com.tarak.demo.studentserver.entity.Student;
import com.tarak.demo.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentService studentService;


    // constructor injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // create the student
    @PostMapping("/addstudent")
    public ResponseEntity<?> storeStudent(@RequestBody Student student) {

        // send student to service for validation and saving
        Student result = studentService.StudentValidate(student);

        // if validation fails
        if (result == null) {
            return ResponseEntity.status(400).body("Invalid data");
        }

        // student created successfully
        return ResponseEntity.status(201).body("Student has been added" + result);
    }


    // get the student using id
    @GetMapping("/getstudent/{id}")
    public ResponseEntity<?> getStudentBy(@PathVariable Integer id) {

        // search student using id
        Student student = studentService.getStudentById(id);

        // if student is not found
        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        // return the student
        return ResponseEntity.status(200).body(student);
    }


    // update the student using id
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudentBy(
            @PathVariable Integer id, @RequestBody Student student) {

        // send id and new student data to service
        Student result = studentService.updateStudentBy(id, student);

        // if student does not exist or data is invalid
        if (result == null) {
            return ResponseEntity.status(400).body("Invalid data or student not found");
        }

        // return updated student
        return ResponseEntity.status(200).body(result);
    }


    // delete the student using id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentBy(@PathVariable Integer id) {

        // delete student using service
        boolean result = studentService.deleteStudentBy(id);

        // if student is not found
        if (result == false) {
            return ResponseEntity.status(404).body("Student not found");
        }

        // student deleted successfully
        return ResponseEntity.status(200).body("Delete successful");
    }
}