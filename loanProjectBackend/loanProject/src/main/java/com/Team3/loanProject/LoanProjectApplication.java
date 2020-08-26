package com.Team3.loanProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties
public class LoanProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(LoanProjectApplication.class, args);
	}

}
