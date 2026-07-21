package com.tarak.demo.studentserver.execptions;


import com.tarak.demo.studentserver.DTO.ExecptionDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @Restcontroller advice for handling execption in controller--
 * @RuntimeException.class this handeles the runtime exections
 */

@RestControllerAdvice
public class GlobalExecption {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExecptionDTO> handleRuntimeException(RuntimeException e, HttpServletRequest req) {
//      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        ExecptionDTO execptionDTO = new ExecptionDTO(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                e.getMessage(),
                req.getRequestURI()
        );
        return ResponseEntity.status(500).
                body(execptionDTO);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(500).
                body(e.getMessage());
    }
}
