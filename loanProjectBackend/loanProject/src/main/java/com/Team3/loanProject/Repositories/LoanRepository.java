package com.Team3.loanProject.Repositories;

import com.Team3.loanProject.Loan;

import java.util.Optional;
import java.util.UUID;

public interface LoanRepository {

    Optional<Loan> findFirstByLoanId(UUID loanId);
}
