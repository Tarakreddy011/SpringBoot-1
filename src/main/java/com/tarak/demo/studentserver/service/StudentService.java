package com.tarak.demo.studentserver.service;

import com.tarak.demo.studentserver.DTO.CreateStudentRequestDTO;
import com.tarak.demo.studentserver.DTO.CreateStudentResponseDTO;
import com.tarak.demo.studentserver.DTO.UpdateStudentRequestDTO;
import com.tarak.demo.studentserver.entity.Student;
import com.tarak.demo.studentserver.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class StudentService {
    StudentRepository studentRepository;


    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO) {

        Student student = mapToStudent(createStudentRequestDTO);


        if (studentRepository.existsByEmail(student.getEmail())) {
            throw new IllegalArgumentException("Email is already taken, try again " +
                    student.getEmail());
        }

        /*if (studentRepository.existsByEmail(student.getEmail())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email is already taken");
        }*/


        studentRepository.save(student);
        return mapToResponseDTO(student);
    }



    /**
     * get student by ID
     *
     * @param id
     * @return
     */
    public Student getStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.get();
        /**
         *
         */
//        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Update student method
     *
     * @param id
     * @param updateStudentRequestDTO
     * @return
     */

    public Student studentUpdate(int id, UpdateStudentRequestDTO updateStudentRequestDTO) {
        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return null; // student not found
        }

        // name and age only update no other update
        result.setName(updateStudentRequestDTO.getName());
        result.setAge(updateStudentRequestDTO.getAge());

        return studentRepository.save(result);
    }


    /**
     * Delete student
     *
     * @param id
     * @return
     */

    public Student deleteStudent(int id) {
        Student result = studentRepository.findById(id).orElse(null);
        if (result == null) {
            return null;
        }
        studentRepository.delete(result);
        return result;
    }


    /**
     * mapto function
     *
     * @param createStudentRequestDTO
     * @return
     */
    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {
        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());
        student.setEmail(createStudentRequestDTO.getEmail());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    private CreateStudentResponseDTO mapToResponseDTO(Student student) {
        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setEmail(student.getEmail());
        createStudentResponseDTO.setDepartment(student.getDepartment());
        createStudentResponseDTO.setDepartment(student.getDepartment());

        return createStudentResponseDTO;

    }


}