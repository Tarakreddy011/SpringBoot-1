package com.tarak.demo.studentserver.DTO;


import com.tarak.demo.studentserver.entity.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentResponseDTO {
    private String name;
    private int age;

    public UpdateStudentResponseDTO(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
    }
}

