package com.tarak.demo.studentserver.service;

import com.tarak.demo.studentserver.entity.Student;
import com.tarak.demo.studentserver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;


    // constructor injection
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    // validate and create the student
    public Student StudentValidate(Student student) {

        // get student data
        int age = student.getAge();
        String name = student.getName();
        String department = student.getDepertment();

        // check student data
        if (age < 18 || name == null || department == null) {
            return null;
        }

        // save student in database
        studentRepository.save(student);

        // return saved student
        return student;
    }


    // get student using id
    public Student getStudentById(int id) {

        // findById returns Optional
        // if student exists return student
        // otherwise return null
        return studentRepository.findById(id).orElse(null);
    }


    // update student using id
    public Student updateStudentBy(int id, Student student) {

        // first find the existing student
        Student existingStudent =
                studentRepository.findById(id).orElse(null);

        // if student does not exist
        if (existingStudent == null) {
            return null;
        }

        // get new student data
        int age = student.getAge();
        String name = student.getName();
        String department = student.getDepertment();

        // validate new student data
        if (age < 18 || name == null || department == null) {
            return null;
        }

        // update existing student data
        existingStudent.setAge(age);
        existingStudent.setName(name);
        existingStudent.setDepertment(department);

        // save updated student in database
        studentRepository.save(existingStudent);

        // return updated student
        return existingStudent;
    }


    // delete student using id
    public boolean deleteStudentBy(int id) {

        // check if student exists
        if (studentRepository.existsById(id) == false) {
            return false;
        }

        // delete student from database
        studentRepository.deleteById(id);

        // deletion successful
        return true;
    }
}