package com.example.onlineTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class OnlineTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTutorialApplication.class, args);
		System.out.println("hello world");
	}

}
