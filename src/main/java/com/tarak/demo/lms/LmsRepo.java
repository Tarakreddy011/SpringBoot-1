package com.tarak.demo.lms;

import org.springframework.stereotype.Repository;

@Repository
public class LmsRepo {
    public LMS savelmas(LMS lms) {
        System.out.println("LMS saved to db !!!!!!11");
        return lms;
    }
}
