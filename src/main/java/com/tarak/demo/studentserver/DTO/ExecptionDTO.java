package com.tarak.demo.studentserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Data is used
 * @AllArgsConstructor  is used to make getter and setter methods with constructors
 *
 */

@Data
@AllArgsConstructor
public class ExecptionDTO {

    private LocalDateTime timestamp;
    private String message;
    private int statuscode;
    private String error;
    private String path;


    public ExecptionDTO(LocalDateTime now, int value, String reasonPhrase, String message, String requestURI) {
    }
}
