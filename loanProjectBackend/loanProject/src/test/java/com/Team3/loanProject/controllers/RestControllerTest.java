package com.Team3.loanProject.controllers;

import com.Team3.loanProject.entities.Applicant;
import com.Team3.loanProject.repositories.ApplicantRepository;
import com.Team3.loanProject.services.ApplicantService;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.CoreMatchers.is;


import java.sql.Date;
import java.time.LocalDate;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;

public class RestControllerTest {

    @Mock
    private ApplicantRepository applicantRepository;

    @Autowired
    private ApplicantService applicantService;

    @Autowired
    private MockMvc mockmvc;



    @Test
    @Ignore
    public void shouldFetchOneApplicantById() throws Exception {

        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("2004-02-04"));
        applicant.setDateSubmitted(Date.valueOf(LocalDate.now()));
        applicant.setMaritalStatus("request.getApplicantmaritalStatus()");
        applicant.setAddressLine1("request.getApplicantaddrLine1()");
        applicant.setAddressLine2("request.getApplicantaddrLine2()");
        applicant.setCity("request.getApplicantcity()");
        applicant.setState("request.getApplicantstate()");
        applicant.setPostalCode("a");
        applicant.setDescription("s");
        applicant.setLoanAmount(874);
        applicant.setLoanPurpose("a");
        applicant.setAnnualSalary(12000);
        applicant.setEmployername("request.getApplicantEmployerName()");
        applicant.setEmployerAddress1("request.getApplicantEmployerAddr1()");
        applicant.setEmployerAddress2("request.getApplicantEmployerAddr2()");
        applicant.setEmployerCity("request.getApplicantEmployerCity()");
        applicant.setEmployerState("request.getApplicantEmployerState()");
        applicant.setEmployerPostalCode("a");
        applicant.setDesignation("request.getApplicantdesignation()");
        applicant.setMobile("a");
        applicant.setHomePhone("s");
        applicant.setOfficePhone("s");
        applicant.setEmailAddress("s");
        applicant.setWorkExperienceMonth(5);
        applicant.setWorkExperienceYears(1);
        applicant.setApplicationStatus("In Progress");
        applicant.setScore("-");
        applicant.setDeclineReason("In Progress");

        given(applicantService.getApplicant(1)).willReturn(applicant);

       this.mockmvc.perform(get("/api/users/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName", is(applicant.getFirstName())))
                .andExpect(jsonPath("$.ssnnumber", is(applicant.getSSNNumber())));
    }

}
