package com.Team3.loanProject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class CreateLoanRequest {

    //    private String ApplicantloanStatus;
    //    private String Applicantdeclinereason;
    //    private String ApplicantScore;


    public Date getApplicantdob() {
        return Applicantdob;
    }

    public void setApplicantdob(Date applicantdob) {
        Applicantdob = applicantdob;
    }

    public double getApplicantloanAmount() {
        return ApplicantloanAmount;
    }

    public void setApplicantloanAmount(double applicantloanAmount) {
        ApplicantloanAmount = applicantloanAmount;
    }

    public String getApplicantloanPurpose() {
        return ApplicantloanPurpose;
    }

    public void setApplicantloanPurpose(String applicantloanPurpose) {
        ApplicantloanPurpose = applicantloanPurpose;
    }

    public String getApplicantdescription() {
        return Applicantdescription;
    }

    public void setApplicantdescription(String applicantdescription) {
        Applicantdescription = applicantdescription;
    }

    public int getApplicantWorkExperienceYears() {
        return ApplicantWorkExperienceYears;
    }

    public void setApplicantWorkExperienceYears(int applicantWorkExperienceYears) {
        ApplicantWorkExperienceYears = applicantWorkExperienceYears;
    }

    public int getApplicantWorkExperienceMonth() {
        return ApplicantWorkExperienceMonth;
    }

    public void setApplicantWorkExperienceMonth(int applicantWorkExperienceMonth) {
        ApplicantWorkExperienceMonth = applicantWorkExperienceMonth;
    }

    public String getApplicantSSN() {
        return ApplicantSSN;
    }

    public void setApplicantSSN(String applicantSSN) {
        ApplicantSSN = applicantSSN;
    }

    public String getApplicantfirstName() {
        return ApplicantfirstName;
    }

    public void setApplicantfirstName(String applicantfirstName) {
        ApplicantfirstName = applicantfirstName;
    }

    public String getApplicantmiddleName() {
        return ApplicantmiddleName;
    }

    public void setApplicantmiddleName(String applicantmiddleName) {
        ApplicantmiddleName = applicantmiddleName;
    }

    public String getApplicantlastName() {
        return ApplicantlastName;
    }

    public void setApplicantlastName(String applicantlastName) {
        ApplicantlastName = applicantlastName;
    }

    public String getApplicantmaritalStatus() {
        return ApplicantmaritalStatus;
    }

    public void setApplicantmaritalStatus(String applicantmaritalStatus) {
        ApplicantmaritalStatus = applicantmaritalStatus;
    }

    public String getApplicantaddrLine1() {
        return ApplicantaddrLine1;
    }

    public void setApplicantaddrLine1(String applicantaddrLine1) {
        ApplicantaddrLine1 = applicantaddrLine1;
    }

    public String getApplicantaddrLine2() {
        return ApplicantaddrLine2;
    }

    public void setApplicantaddrLine2(String applicantaddrLine2) {
        ApplicantaddrLine2 = applicantaddrLine2;
    }

    public String getApplicantcity() {
        return Applicantcity;
    }

    public void setApplicantcity(String applicantcity) {
        Applicantcity = applicantcity;
    }

    public String getApplicantstate() {
        return Applicantstate;
    }

    public void setApplicantstate(String applicantstate) {
        Applicantstate = applicantstate;
    }

    public String getApplicantpostalCode() {
        return ApplicantpostalCode;
    }

    public void setApplicantpostalCode(String applicantpostalCode) {
        ApplicantpostalCode = applicantpostalCode;
    }

    public String getApplicanthomePhone() {
        return ApplicanthomePhone;
    }

    public void setApplicanthomePhone(String applicanthomePhone) {
        ApplicanthomePhone = applicanthomePhone;
    }

    public String getApplicantofficePhone() {
        return ApplicantofficePhone;
    }

    public void setApplicantofficePhone(String applicantofficePhone) {
        ApplicantofficePhone = applicantofficePhone;
    }

    public String getApplicantmobile() {
        return Applicantmobile;
    }

    public void setApplicantmobile(String applicantmobile) {
        Applicantmobile = applicantmobile;
    }

    public String getApplicantemail() {
        return Applicantemail;
    }

    public void setApplicantemail(String applicantemail) {
        Applicantemail = applicantemail;
    }

    public double getApplicantannualsalary() {
        return Applicantannualsalary;
    }

    public void setApplicantannualsalary(double applicantannualsalary) {
        Applicantannualsalary = applicantannualsalary;
    }

    public String getApplicantdesignation() {
        return Applicantdesignation;
    }

    public void setApplicantdesignation(String applicantdesignation) {
        Applicantdesignation = applicantdesignation;
    }

    public String getApplicantEmployerName() {
        return ApplicantEmployerName;
    }

    public void setApplicantEmployerName(String applicantEmployerName) {
        ApplicantEmployerName = applicantEmployerName;
    }

    public String getApplicantEmployerAddr1() {
        return ApplicantEmployerAddr1;
    }

    public void setApplicantEmployerAddr1(String applicantEmployerAddr1) {
        ApplicantEmployerAddr1 = applicantEmployerAddr1;
    }

    public String getApplicantEmployerAddr2() {
        return ApplicantEmployerAddr2;
    }

    public void setApplicantEmployerAddr2(String applicantEmployerAddr2) {
        ApplicantEmployerAddr2 = applicantEmployerAddr2;
    }

    public String getApplicantEmployerCity() {
        return ApplicantEmployerCity;
    }

    public void setApplicantEmployerCity(String applicantEmployerCity) {
        ApplicantEmployerCity = applicantEmployerCity;
    }

    public String getApplicantEmployerState() {
        return ApplicantEmployerState;
    }

    public void setApplicantEmployerState(String applicantEmployerState) {
        ApplicantEmployerState = applicantEmployerState;
    }

    public String getApplicantEmployerPostalCode() {
        return ApplicantEmployerPostalCode;
    }

    public void setApplicantEmployerPostalCode(String applicantEmployerPostalCode) {
        ApplicantEmployerPostalCode = applicantEmployerPostalCode;
    }

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date Applicantdob;
    private double ApplicantloanAmount;
    private String ApplicantloanPurpose;
    private String Applicantdescription;


    private int ApplicantWorkExperienceYears;
    private int ApplicantWorkExperienceMonth;
    private String ApplicantSSN;
    private String ApplicantfirstName;
    private String ApplicantmiddleName;
    private String ApplicantlastName;
    private String ApplicantmaritalStatus;
    private String ApplicantaddrLine1;
    private String ApplicantaddrLine2;
    private String Applicantcity;
    private String Applicantstate;
    private String ApplicantpostalCode;
    private String ApplicanthomePhone;
    private String ApplicantofficePhone ;
    private String Applicantmobile;
    private String Applicantemail;
    private double Applicantannualsalary;
    private String Applicantdesignation;
    private String ApplicantEmployerName;
    private String ApplicantEmployerAddr1;
    private String ApplicantEmployerAddr2;
    private String ApplicantEmployerCity;
    private String ApplicantEmployerState;
    private String ApplicantEmployerPostalCode;



}
