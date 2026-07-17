package com.tarak.demo.lms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LmsRepo extends JpaRepository<LMS,Integer> {
//    public LMS savelmas(LMS lms) {
//        System.out.println("LMS saved to db !!!!!!11");
//        return lms;
//    }
}
