package com.bikash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootSchedulingProj2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootSchedulingProj2Application.class, args);
	}

}
