package com.jilit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jilit.beans.A;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Starting boot application...");
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		System.out.println("Application is started.");
	    System.out.println("obtaining A bean from the container...");
	    A a=(A)ctx.getBean("a");
	    System.out.println("A bean is: ");
	    System.out.println(a);
	}

}
