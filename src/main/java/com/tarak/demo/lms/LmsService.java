package com.tarak.demo.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LmsService {

    LmsRepo lmsrepo;

    @Autowired
    public LmsService(LmsRepo lmsrepo) {
        this.lmsrepo = lmsrepo;
    }

    public LMS lmsvalidate(LMS lms){

        int id = lms.getId();
        String bookname =  lms.getBookname();
        String author =  lms.getAuthor();

        if (id < 1 && bookname == null && author== null ) {
            return null;
        }
        lmsrepo.savelmas(lms);
        return lms;
    }
}
