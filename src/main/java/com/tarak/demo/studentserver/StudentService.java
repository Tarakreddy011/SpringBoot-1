package com.tarak.demo.studentserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository;


    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student StudentValidate(Student student) {
        int id = student.getid();
        int age = student.getAge();
        String name = student.getName();
        String department = student.getDepertment();

        if (age < 18 && name == null && department == null ) {
            return null;
        }
        studentRepository.save(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
