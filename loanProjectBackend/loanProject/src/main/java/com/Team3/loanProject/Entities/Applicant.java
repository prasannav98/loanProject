package com.Team3.loanProject.Entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="lltable",schema = "loangiver")
public class Applicant  {

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }

    public String getSSNNumber() {
        return SSNNumber;
    }

    public void setSSNNumber(String SSNNumber) {
        this.SSNNumber = SSNNumber;
    }

    public int getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        LoanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return LoanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        LoanPurpose = loanPurpose;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getOfficePhone() {
        return OfficePhone;
    }

    public void setOfficePhone(String officePhone) {
        OfficePhone = officePhone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getEmployername() {
        return Employername;
    }

    public void setEmployername(String employername) {
        Employername = employername;
    }

    public int getAnnualSalary() {
        return AnnualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        AnnualSalary = annualSalary;
    }

    public String getEmployerAddress1() {
        return EmployerAddress1;
    }

    public void setEmployerAddress1(String employerAddress1) {
        EmployerAddress1 = employerAddress1;
    }

    public String getEmployerAddress2() {
        return EmployerAddress2;
    }

    public void setEmployerAddress2(String employerAddress2) {
        EmployerAddress2 = employerAddress2;
    }

    public String getEmployerCity() {
        return EmployerCity;
    }

    public void setEmployerCity(String employerCity) {
        EmployerCity = employerCity;
    }

    public String getEmployerState() {
        return EmployerState;
    }

    public void setEmployerState(String employerState) {
        EmployerState = employerState;
    }

    public String getEmployerPostalCode() {
        return EmployerPostalCode;
    }

    public void setEmployerPostalCode(String employerPostalCode) {
        EmployerPostalCode = employerPostalCode;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getWorkExperienceYears() {
        return WorkExperienceYears;
    }

    public void setWorkExperienceYears(int workExperienceYears) {
        WorkExperienceYears = workExperienceYears;
    }

    public int getWorkExperienceMonth() {
        return WorkExperienceMonth;
    }

    public void setWorkExperienceMonth(int workExperienceMonth) {
        WorkExperienceMonth = workExperienceMonth;
    }

    public String getApplicationStatus() {
        return ApplicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        ApplicationStatus = applicationStatus;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getDeclineReason() {
        return DeclineReason;
    }

    public void setDeclineReason(String declineReason) {
        DeclineReason = declineReason;
    }

    public Date getDateSubmitted() {
        return DateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        DateSubmitted = dateSubmitted;
    }

    @Column(name = "First_Name")
    private String FirstName;
    @Column(name = "Middle_Name")
    private String MiddleName;
    @Column(name = "Last_Name")
    private String LastName;
    @Column(name = "Date_of_Birth")
    private Date DateofBirth;
    @Column(name = "Date_Submitted")
    private Date DateSubmitted;
    @Column(name = "Marital_Status")
    private String MaritalStatus;
    @Column(name = "SSN_Number")
    private String SSNNumber;
    @Column(name = "Loan_Amount")
    private int LoanAmount;
    @Column(name = "Loan_Purpose")
    private String LoanPurpose;
    @Column(name = "Description")
    private String Description;
    @Column(name = "Address_Line_1")
    private String AddressLine1;
    @Column(name = "Address_Line_2")
    private String AddressLine2;
    @Column(name = "City")
    private String City;
    @Column(name = "State")
    private String State;
    @Column(name = "Postal_Code")
    private String PostalCode;
    @Column(name = "Home_Phone")
    private String HomePhone;
    @Column(name = "Office_Phone")
    private String OfficePhone;
    @Column(name = "Mobile")
    private String Mobile;
    @Column(name = "Email_Address")
    private String EmailAddress;
    @Column(name = "Employer_name")
    private String Employername;
    @Column(name = "Annual_Salary")
    private int AnnualSalary;
    @Column(name = "Employer_Address_1")
    private String EmployerAddress1;
    @Column(name = "Employer_Address_2")
    private String EmployerAddress2;
    @Column(name = "Employer_City")
    private String EmployerCity;
    @Column(name = "Employer_State")
    private String EmployerState;
    @Column(name = "Employer_Postal_Code")
    private String EmployerPostalCode;
    @Column(name = "Designation")
    private String Designation;
    @Column(name = "Work_Experience_Years")
    private int WorkExperienceYears;
    @Column(name = "Work_Experience_Month")
    private int WorkExperienceMonth;
    @Column(name = "Application_Status")
    private String ApplicationStatus;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "Score")
    private String Score;
    @Column(name = "Decline_Reason")
    private String DeclineReason;


}
