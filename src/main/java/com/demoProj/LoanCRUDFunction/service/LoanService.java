package com.demoProj.LoanCRUDFunction.service;

import com.demoProj.LoanCRUDFunction.entity.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LoanService {
    public Loan saveLoan(Loan loan);

    public List<Loan> fetchAllLoans(Loan loan);

    public Loan fetchLoanById(Long loanId);

    public void deleteLoan(Long loanId);

    public Loan updateLoan(Long loanId, Loan loan);
}
