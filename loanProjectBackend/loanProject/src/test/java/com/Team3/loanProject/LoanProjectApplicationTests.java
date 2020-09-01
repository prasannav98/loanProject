package com.Team3.loanProject;

import com.Team3.loanProject.entities.Applicant;
import com.Team3.loanProject.repositories.ApplicantRepository;
import com.Team3.loanProject.services.ApplicantService;
import com.Team3.loanProject.services.ApplicantServiceTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.*;



@ActiveProfiles(value = "tests")
@ContextConfiguration(classes = TestConfig.class)
class LoanProjectApplicationTests {


	void contextLoads() {
	}

}






