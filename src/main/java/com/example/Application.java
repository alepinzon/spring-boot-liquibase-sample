package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		try{
//			SpringApplication.run(Application.class, args);
//		}catch (Exception exception){
//
//			System.out.println("*********** Exception Handling ---> " + exception.getMessage());
//
//			throw  exception;
//		}
	}

}
