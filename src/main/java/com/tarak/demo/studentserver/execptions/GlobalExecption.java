package com.tarak.demo.studentserver.execptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Restcontroller advice for handling execption in controller--
 * @RuntimeException.class this handeles the runtime exections
 */

@RestControllerAdvice
public class GlobalExecption {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
//      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        return ResponseEntity.status(500).
                body(e.getMessage());
    }

}
