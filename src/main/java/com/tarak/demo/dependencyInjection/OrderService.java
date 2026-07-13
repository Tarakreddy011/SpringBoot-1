package com.tarak.demo.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// tell spring to create object of this class
public class OrderService {


    /**
     * Feild inhjection
     *      * this is feild injection
     *      * here payment service and order servie will be wired together using autowired
     *
     */
   // @Autowired
    PaymentService paymentService;
   // PaymentService paymentService = new PaymentService();

    /**
     * Constructor injection
     * we use autowired to connect to the required class
     */
    //@Autowired
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    /**
     * This is setter injection
     *
     */
    //@Autowired
    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void plceorder() {
        paymentService.payment();
        System.out.println("OrderService order placed done !!!!!11");
    }
}
