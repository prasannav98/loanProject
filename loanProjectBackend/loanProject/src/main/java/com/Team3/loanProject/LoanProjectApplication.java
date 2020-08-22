package com.Team3.loanProject;

import com.Team3.loanProject.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties
public class LoanProjectApplication {

	@Autowired
	//private LoanRepository loanRepository;

	public static void main(String[] args) {
		SpringApplication.run(LoanProjectApplication.class, args);
	}

}
