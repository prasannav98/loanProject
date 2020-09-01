package com.Team3.loanProject.repositories;

import com.Team3.loanProject.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {

}
