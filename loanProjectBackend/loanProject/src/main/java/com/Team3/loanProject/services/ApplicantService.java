package com.Team3.loanProject.services;

import com.Team3.loanProject.entities.Applicant;
import com.Team3.loanProject.entities.Data;
import com.Team3.loanProject.repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import static java.lang.Boolean.FALSE;
import static java.lang.StrictMath.pow;

@Service
public class ApplicantService {


    @Autowired
    ApplicantRepository applicantRepository;

    @Autowired
    DataService dataService;

    public String getDeclinereason() {
        return declinereason;
    }

    public void setDeclinereason(String declinereason) {
        this.declinereason = declinereason;
    }

    String declinereason;

    public Applicant createApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public void updateApplicant(Applicant applicant) {
        applicantRepository.save(applicant);
    }

    public Applicant getApplicant(int id) {
        Optional<Applicant> optional = applicantRepository.findById(id);
        Applicant applicant = optional.get();
        return applicant;
    }

    public List<Applicant> getall() {
        return applicantRepository.findAll();
    }

    public boolean frontEndValid(Applicant applicant){
        boolean valid= true;

        LocalDate l = applicant.getDateofBirth().toLocalDate(); //specify year, month, date directly
        LocalDate now = LocalDate.now(); //gets localDate Period
        Period diff = Period.between(l, now); //difference between the dates is calculated

        if(applicant.getAnnualSalary()<10000){
            valid=FALSE;
            applicant.setDeclineReason("Declined at FrontEnd - Salary is less than $10000");
        }
        else if(diff.getYears()<18||diff.getYears()>65) {
            valid=FALSE;
            applicant.setDeclineReason("Declined at FrontEnd - Age not Age Group in 18-65");
        }
        else if(applicant.getWorkExperienceYears()<1&&applicant.getWorkExperienceMonth()<6){
            valid=FALSE;
            applicant.setDeclineReason("Declined at FrontEnd - Work Experience is less than 6 months");
        }
        return valid;
    }


    public double calculateScore(Applicant applicant) {

        Data data = dataService.getData(Integer.parseInt(applicant.getSSNNumber()));

        double emp_length=(((double)applicant.getWorkExperienceYears()*12.0)+(double)applicant.getWorkExperienceMonth())/12.0;
        if(emp_length<1){emp_length=1;}
        else if(emp_length>10){emp_length=10;}

        double debt_to_income_ratio=(double) applicant.getLoanAmount()/applicant.getAnnualSalary();

        double purposeweight=0;

        if(applicant.getLoanPurpose()=="Debt"){ purposeweight=0.9754;}
        else if(applicant.getLoanPurpose()=="Educational"){purposeweight=0.2034;}
        else if(applicant.getLoanPurpose()=="Personal"){purposeweight=0.5189;}
        else {purposeweight=0.7729;}

        double dl2y=data.getD2y();
        double il6m=data.getIl6m();
        double msld= data.getMsld();
        double mslr= data.getMslr();
        double oa=data.getOpenaccount();
        double pr=data.getPublicrecord();
        double ru=data.getRevolutil();
        double ta=data.getTotalaccounts();

        double score=0;

        score = emp_length*0.0041 + debt_to_income_ratio*(-2.818) + purposeweight + dl2y*(-0.1380)+il6m*(-0.2159) + msld*0.0016 + mslr*(-0.0010) + oa*(-0.0198) + pr*(-0.4993) + ru*(-1.3039) + ta*0.0079 + 2.4705;
        score = pow(2.71, score);
        double dtr = debt_to_income_ratio*(-2.818);
        setDeclinereason("Your Loan is higher for your given Annual income");
        if(dtr>(dl2y*(-0.1380))){
            dtr=dl2y*(-0.1380);
            setDeclinereason("Your Delinquency is high");

        }
        if(dtr>(il6m*(-0.2159))){
            dtr=il6m*(-0.2159);
            setDeclinereason("Too many inquiries in this given 6 month period by crediter");

        }
        if(dtr>(mslr*(-0.0010))){
            dtr=mslr*(-0.0010);
            setDeclinereason("The months since last public record is high");

        }
        if(dtr>(oa*(-0.0198))){
            dtr=oa*(-0.0198);
            setDeclinereason("There are already many open credit lines in the borrower's account");

        }
        if(dtr>(pr*(-0.4993))){
            dtr= pr*(-0.4993);
            setDeclinereason("Too many derogatory public records against borrower");

        }
        if(dtr>(ru*(-1.3039))){
            dtr= ru*(-1.3039);
            setDeclinereason("Revolving line Utilization rate is too high");

        }

//        System.out.println(emp_length);
//        System.out.println(score);
//        System.out.println(dtr);
//        System.out.println(dl2y);
//        System.out.println(il6m);
//        System.out.println(msld);
//        System.out.println(mslr);
//        System.out.println(oa);
//        System.out.println(pr);
//        System.out.println(ru);
//        System.out.println(purposeweight);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();


        return score;
    }

}
