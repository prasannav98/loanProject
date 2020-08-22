package com.Team3.loanProject.Services;

import com.Team3.loanProject.dto.LoanApplianceDTO;
import com.Team3.loanProject.dto.LoanApplianceResultDTO;
import org.springframework.stereotype.Service;

@Service
public interface LoanService {

    LoanApplianceResultDTO applyForLoan(LoanApplianceDTO loanApplianceDTO);
}
