package com.tarak.demo.studentserver.service;

import com.tarak.demo.studentserver.entity.Student;
import com.tarak.demo.studentserver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student StudentValidate(Student student) {
         //int id = student.getid();
        int age = student.getAge();
        String name = student.getName();
        String department = student.getDepertment();

        if (age < 18 || name == null || department == null ) {
            return null;
        }
        studentRepository.save(student);
        return student;
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
}
