package com.tarak.demo.studentserver.controller;


import com.tarak.demo.studentserver.entity.Teacher;
import com.tarak.demo.studentserver.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/createteacher")
    public ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
        Teacher savedTeacher = teacherService.createTeacher(teacher);
        return ResponseEntity.status(201).body(savedTeacher);
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Teacher> getByID(Integer id){
        Teacher getbyid = teacherService.getTeacherById(id);
        return ResponseEntity.status(200).body(getbyid);
    }
}
