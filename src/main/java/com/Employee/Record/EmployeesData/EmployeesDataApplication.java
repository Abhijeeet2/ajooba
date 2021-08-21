package com.Employee.Record.EmployeesData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.Employee.Record.EmployeesData"})

public class EmployeesDataApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeesDataApplication.class, args);
		System.out.println("Hello");
	}

}
