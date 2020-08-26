package com.Team3.loanProject.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="loantable",schema = "loangiver")
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

    public double getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(double loanAmount) {
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

    public double getAnnualSalary() {
        return AnnualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
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

    //@Column
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private	 Date DateofBirth;
    private String MaritalStatus;
    private String SSNNumber;
    private double LoanAmount;
    private String LoanPurpose;
    private String Description;
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;
    private String HomePhone;
    private String OfficePhone;
    private String Mobile;
    private String EmailAddress;
    private String Employername;
    private double AnnualSalary;
    private String EmployerAddress1;
    private String EmployerAddress2;
    private String EmployerCity;
    private String EmployerState;
    private String EmployerPostalCode;
    private String Designation;
    private int WorkExperienceYears;
    private int WorkExperienceMonth;
    private String ApplicationStatus;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String Score;
    private String DeclineReason;


}
