package com.tarak.demo;

import com.tarak.demo.dependencyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

//		Student student = context.getBean(Student.class);
//		student.setName("Tarak");
//		student.setAge(20);
//		student.display();

//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.plceorder();

	}
}