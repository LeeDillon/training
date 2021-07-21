package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
	
    Object byName = context.getBean("getTime");
    String byType = context.getBean(String.class);
    String byBoth = context.getBean("getTime", String.class);

    System.out.println(byName);
  
    System.out.println(byType);
    System.out.println(byBoth);
	}


    

}
