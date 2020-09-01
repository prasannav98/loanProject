package com.Team3.loanProject.services;

import com.Team3.loanProject.TestConfig;
import com.Team3.loanProject.entities.Applicant;
import com.Team3.loanProject.repositories.ApplicantRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

//@ContextConfiguration(classes = TestConfig.class)
@RunWith(MockitoJUnitRunner.class)
public class ApplicantServiceTest {

    @Mock
    private ApplicantRepository applicantRepository;

    @InjectMocks
    private ApplicantService applicantService= new ApplicantService();

    @org.junit.Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        applicantService=null;
    }

    @Test
    public void getApplicant(){
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

        given(applicantRepository.findById(1)).willReturn(Optional.of(applicant));

        assertEquals(applicantService.getApplicant(1), applicant);

    }

    @Test
    public void MinorTest(){
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc is age issue

        assertEquals(b,false);
        assertEquals(applicant.getDeclineReason(),"Declined at FrontEnd - Age not Age Group in 18-65");

    }

    @Test
    public void CorrectAgeTest(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1998-02-04"));
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==true and

        assertEquals(b,true);
//        assertEquals(applicant.getDeclineReason(),"-");

    }

    @Test
    public void OldAgeTest(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1950-02-04"));
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc age

        assertEquals(b,false);
        assertEquals(applicant.getDeclineReason(),"Declined at FrontEnd - Age not Age Group in 18-65");

    }

    @Test
    public void LowIncome(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1990-02-04"));
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
        applicant.setAnnualSalary(8000);
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc salary

        assertEquals(b,false);
        assertEquals(applicant.getDeclineReason(),"Declined at FrontEnd - Salary is less than $10000");

    }

    @Test
    public void CorrectIncome(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1990-02-04"));
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc salary

        assertEquals(b,true);
//        assertEquals(applicant.getDeclineReason(),"-");

    }

    @Test
    public void LessWorkEx(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1990-02-04"));
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
        applicant.setAnnualSalary(10000);
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
        applicant.setWorkExperienceYears(0);
        applicant.setApplicationStatus("In Progress");
        applicant.setScore("-");
        applicant.setDeclineReason("In Progress");

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc salary

        assertEquals(b,false);
        assertEquals(applicant.getDeclineReason(),"Declined at FrontEnd - Work Experience is less than 6 months");

    }


    @Test
    public void CorrectWorkEx(){
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("R");
        applicant.setFirstName("S");
        applicant.setMiddleName("k");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf("1990-02-04"));
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
        applicant.setAnnualSalary(10000);
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

        boolean b=applicantService.frontEndValid(applicant);

        // b==false and dc salary

        assertEquals(b,true);
//        assertEquals(applicant.getDeclineReason(),"-");

    }




    @org.junit.Test
    public void createApplicant() {
        Applicant applicant=new Applicant();
        applicant.setId(1);
        applicant.setSSNNumber("q");
        applicant.setFirstName("w");
        applicant.setMiddleName("er");
        applicant.setLastName("e");
        applicant.setDateofBirth(Date.valueOf(LocalDate.now()));
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
        applicant.setAnnualSalary(4457);
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

        given(applicantRepository.save(applicant)).willReturn(applicant);

        Applicant a=applicantService.createApplicant(applicant);

        assertEquals(a, applicant);


    }

    @org.junit.Test
    public void updateApplicant() {
    }





}

