package com.loginregistration.loginregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.loginregistration.loginregistration.Service.EmployeeService"})
public class LoginregistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginregistrationApplication.class, args);
	}

}
