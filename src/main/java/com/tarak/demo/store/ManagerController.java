package com.tarak.demo.store;


import com.tarak.demo.studentserver.DTO.CreateStudentRequestDTO;
import com.tarak.demo.studentserver.DTO.CreateStudentResponseDTO;
import com.tarak.demo.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @Autowired
    ManagerRepo managerRepo;

    @Autowired
    ManagerService managerService;

    @PostMapping("/createmanager")
    public ResponseEntity<?> storemanager(@RequestBody ManagerRequestDTO managerRequestDTO) {
        ManagerResponseDTO result = managerService.savemanger(managerRequestDTO);

        return ResponseEntity.ok(result);
    }

//    @PostMapping("/create")
//    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {
//        CreateStudentResponseDTO result = studentService.studentValidate(createStudentRequestDTO);
//
//        if (result == null) {
//            return ResponseEntity.status(400).body("one of the entru is wrong ");
//        }
//
//        //if(result.)
//        return ResponseEntity.status(201).body(result);
//    }
}
