package com.Team3.loanProject;

import com.Team3.loanProject.controllers.RestControllerTest;
import com.Team3.loanProject.services.ApplicantService;
import com.Team3.loanProject.services.ApplicantServiceTest;
import com.Team3.loanProject.services.ApplicantServiceTest.*;
import com.Team3.loanProject.services.DataService;
import com.Team3.loanProject.services.DataServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan(basePackages = "com.Team3")
public class TestConfig {


    ApplicantServiceTest applicantServiceTest;
    DataServiceTest dataServiceTest;
    RestControllerTest restControllerTest;

}
