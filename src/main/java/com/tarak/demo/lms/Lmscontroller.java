package com.tarak.demo.lms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lmscontroller {

    LmsService lmsService;

    @Autowired
    public Lmscontroller(LmsService lmsService)
    {
        this.lmsService = lmsService;
    }

    @PostMapping("/lms")
    public ResponseEntity<LMS> storelms(@RequestBody LMS lms){
        LMS result = lmsService.lmsvalidate(lms);

        if (result == null) {
            return ResponseEntity.status(400).body(result);
        }
        return ResponseEntity.status(201).body(result);
    }
}
