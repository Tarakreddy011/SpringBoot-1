package com.tarak.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LPU {

    /**
     * singleton is egar so we get
     * prototype is lazy so obj is not created
     */

    LPU() {
        System.out.println("Lpu rank NAC A+++++");
    }

    public void admiision(){
        System.out.println("admiision");
    }

    public void umc(){
        System.out.println("umc");
    }

    public void pepcClass(){
        System.out.println("pepcClass");
    }
}
