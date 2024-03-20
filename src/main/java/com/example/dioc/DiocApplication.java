package com.example.dioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DiocApplication.class, args);

		var context = SpringApplication.run(DiocApplication.class);

		ValueAnnotationDemo valueAnnotationDemo= context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getEmail());
		System.out.println(valueAnnotationDemo.getPassword());
		System.out.println(valueAnnotationDemo.getJavaHome());
		//System.out.println(valueAnnotationDemo.getHomeDir());
	}

}
