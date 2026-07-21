package com.tarak.demo.studentserver.controller;


import com.tarak.demo.studentserver.DTO.CreateStudentRequestDTO;
import com.tarak.demo.studentserver.DTO.CreateStudentResponseDTO;
import com.tarak.demo.studentserver.DTO.UpdateStudentRequestDTO;
import com.tarak.demo.studentserver.DTO.UpdateStudentResponseDTO;
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


    /**
     * post maping
     *
     * @param createStudentRequestDTO
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {
        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);

        if (result == null) {
            return ResponseEntity.status(400).body("one of the entru is wrong ");
        }

        //if(result.)
        return ResponseEntity.status(201).body(result);
    }

    /**
     * get mapping
     *
     * @param id
     * @return
     */
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) throws Exception {

        Student student = studentService.getStudentById(id);

//        if (student == null) {
//            return ResponseEntity.status(404).body("Student not found");
//        }

        return ResponseEntity.ok(student);
    }


    /**
     * put mapping
     *
     * @param id
     * @return
     */

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,
                                           @RequestBody UpdateStudentRequestDTO updateStudentRequestDTO) {
        Student updatedStudent = studentService.studentUpdate(id, updateStudentRequestDTO);

        if (updatedStudent == null) {
            return ResponseEntity.status(400).body("Invalid input or student not found");
        }

        // return name and age no other return
        UpdateStudentResponseDTO responseDTO = new UpdateStudentResponseDTO(updatedStudent);
        return ResponseEntity.ok(responseDTO);
    }


    /**
     * deletyr mapping
     *
     * @param id
     * @return
     */

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        Student student = studentService.deleteStudent(id);
        if (student == null) {
            return ResponseEntity.status(400).body("Invalid input");
        }
        return ResponseEntity.status(200).body("Student deleted");
    }
}