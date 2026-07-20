package com.tarak.demo.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

    @PostMapping("/createstore")
    public ResponseEntity<?> createStore(@RequestBody CreateStoreRequestDTO request) {
        CreateStoreResponseDTO result = storeService.savedetails(request);

        if(result == null)
        {
            return ResponseEntity.status(400).body("Invalid input");
        }
        return  ResponseEntity.status(201).body(result);
    }
}