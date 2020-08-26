package com.Team3.loanProject.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

import com.Team3.loanProject.Entities.Applicant;
import com.Team3.loanProject.Repositories.ApplicantRepository;
import com.Team3.loanProject.Services.ApplicantService;
import com.Team3.loanProject.dto.CreateLoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperationsDependsOnPostProcessor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class LoanRestController {

    @Autowired
    ApplicantRepository applicantRepository;

    private ApplicantService applicantService;

    @RequestMapping(value = "/home")
    public String home(){
        return "Welcome";
    }

    @RequestMapping(value = "/loans", method = RequestMethod.GET)
    public List<Applicant> getLoans(){
        return applicantService.getall();
    }

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @Transactional
    public Applicant postLoan(CreateLoanRequest request){

        Applicant applicant= new Applicant();

        applicant.setSSNNumber(request.getApplicantSSN());
        applicant.setFirstName(request.getApplicantfirstName());
        applicant.setMiddleName(request.getApplicantmiddleName());
        applicant.setLastName(request.getApplicantlastName());
        applicant.setDateofBirth(request.getApplicantdob());
        applicant.setMaritalStatus(request.getApplicantmaritalStatus());
        applicant.setAddressLine1(request.getApplicantaddrLine1());
        applicant.setAddressLine2(request.getApplicantaddrLine2());
        applicant.setCity(request.getApplicantcity());
        applicant.setState(request.getApplicantstate());
        applicant.setPostalCode(request.getApplicantpostalCode());
        applicant.setDescription(request.getApplicantdescription());
        applicant.setLoanAmount(request.getApplicantloanAmount());
        applicant.setLoanPurpose(request.getApplicantloanPurpose());
        applicant.setEmployername(request.getApplicantEmployerName());
        applicant.setCity(request.getApplicantEmployerCity());
        applicant.setState(request.getApplicantEmployerState());
        applicant.setEmployerAddress1(request.getApplicantEmployerAddr1());
        applicant.setEmployerAddress2(request.getApplicantEmployerAddr2());
        applicant.setEmployerCity(request.getApplicantEmployerCity());
        applicant.setEmployerState(request.getApplicantEmployerState());
        applicant.setEmployerPostalCode(request.getApplicantEmployerPostalCode());
        applicant.setDesignation(request.getApplicantdesignation());
        applicant.setHomePhone(request.getApplicanthomePhone());
        applicant.setOfficePhone(request.getApplicantofficePhone());
        applicant.setEmailAddress(request.getApplicantemail());
        applicant.setWorkExperienceMonth(request.getApplicantWorkExperienceMonth());
        applicant.setWorkExperienceYears(request.getApplicantWorkExperienceYears());

        applicant.setApplicationStatus("In Progress");
        applicant.setScore("-");
        applicant.setDeclineReason("In Progress");

        Applicant applicant1=applicantService.createApplicant(applicant);

        boolean valid=TRUE;
        LocalDate l = applicant.getDateofBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate Period
        Period diff = Period.between(l, now); //difference between the dates is calculated

        if(applicant.getAnnualSalary()<10000) valid=FALSE;
        else if(diff.getYears()<18||diff.getYears()>65) valid=FALSE;
        else if(applicant.getWorkExperienceYears()<1&&applicant.getWorkExperienceMonth()<6) valid=FALSE;

        int score=0;

        if(valid){
            score=applicantService.calculateScore(applicant);
            applicant.setScore(String.valueOf(score));
            if(score>10){ //threshold is 10 randomly, to be calculated by prasanna
                applicant.setApplicationStatus("Approved");
                applicant.setDeclineReason("-");
            }
            else{
                applicant.setApplicationStatus("Declined");
                applicant.setDeclineReason(" "); //prassanna take
            }
        }

        applicantService.updateApplicant(applicant);

        return null;
    }

    @RequestMapping(value = "/loans/{id}")
    public Applicant showLoan(@PathVariable("id") int id){
        return applicantService.getApplicant(id);
    }

    @RequestMapping(value = "/success")
    public String success(){
        return "Submitted";
    }

}
