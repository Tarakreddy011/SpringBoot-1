package com.tarak.demo.server;


import com.tarak.demo.dependencyInjection.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest controller is saying that this class will be handling the incoming request
 */
@RestController
public class ServerHello {


    /**
     *get mapping is used to map the get request, and it returns the method data writtem below
     * understading the browser request
     * @Component is used internally
     *
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello  Tarak !!!";
    }

}
