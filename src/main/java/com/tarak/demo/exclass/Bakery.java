package com.tarak.demo.exclass;

import com.tarak.demo.dependencyInjection.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Bakery {

    PaymentService paymentService;
    Bun bun;


    /**
     * Setter Injection is used here we set the payment servise using setter and also call it using aautowired
     * @param paymentService
     */
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Autowired
    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void bakeryslip(){
        System.out.println("---- bakery slip ---");
        System.out.println("payment first");
        paymentService.payment();
        bun.bunMaker();
        System.out.println("bun made complete");
    }
}
