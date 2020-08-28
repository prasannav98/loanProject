package com.Team3.loanProject.Services;

import com.Team3.loanProject.Entities.Applicant;
import com.Team3.loanProject.Repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;



    public Applicant createApplicant(Applicant applicant){
        return applicantRepository.save(applicant);
    }

    public void updateApplicant(Applicant applicant){
        applicantRepository.save(applicant);
    }

    public Applicant getApplicant(int id){
        Optional<Applicant> optional=applicantRepository.findById(id);
        Applicant applicant=optional.get();
        return applicant;
    }

    public List<Applicant> getall(){
        return applicantRepository.findAll();
    }

    public int calculateScore(Applicant applicant){
        return 11;
    }

}
