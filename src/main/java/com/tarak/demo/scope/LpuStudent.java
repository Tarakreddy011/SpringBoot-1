package com.tarak.demo.scope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LpuStudent {

    /**
     * we use autowired so that we can create the oblect of the lazy class and get the info
     */

    @Autowired
    private LPU lpu;
}
