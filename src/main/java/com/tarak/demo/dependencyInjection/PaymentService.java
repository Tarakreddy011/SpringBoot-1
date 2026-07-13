package com.tarak.demo.dependencyInjection;


import org.springframework.stereotype.Component;

@Component
// tell spring to create object of this class
public class PaymentService {


    /**
     * this is feild injection
     */
    //PaymentService paymentService = new PaymentService();


    public void payment() {
        System.out.println("PaymentService payment done !!!!!11");
    }
}
