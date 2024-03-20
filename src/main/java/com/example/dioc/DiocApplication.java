package com.example.dioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DiocApplication.class, args);

		var context = SpringApplication.run(DiocApplication.class);

	}

}
