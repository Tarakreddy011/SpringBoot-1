package com.tarak.demo.studentserver.service;


import com.tarak.demo.studentserver.entity.Teacher;
import com.tarak.demo.studentserver.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TeacherService {

    TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(int id){
        return teacherRepository.getOne(id);
    }

}
