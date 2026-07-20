package com.tarak.demo.scope;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LPU {

    @NotNull
    @Positive
    private String name;
    @NotBlank
    private int age;
    @Email
    private String Email;

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
