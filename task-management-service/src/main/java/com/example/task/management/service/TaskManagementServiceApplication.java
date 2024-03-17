package com.example.task.management.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TaskManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementServiceApplication.class, args);
	}

}
