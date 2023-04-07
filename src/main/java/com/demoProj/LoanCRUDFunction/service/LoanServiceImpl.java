package com.demoProj.LoanCRUDFunction.service;

import com.demoProj.LoanCRUDFunction.entity.Loan;
import com.demoProj.LoanCRUDFunction.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoanServiceImpl implements LoanService{
    @Autowired
    private LoanRepository loanRepository;
    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> fetchAllLoans(Loan loan) {
        return loanRepository.findAll();
    }

    @Override
    public Loan fetchLoanById(Long loanId) {
        return loanRepository.findById(loanId).get();
    }

    @Override
    public void deleteLoan(Long loanId) {
        loanRepository.deleteById(loanId);
    }

    @Override
    public Loan updateLoan(Long loanId, Loan loan) {
        Loan loanDB = loanRepository.findById(loanId).get();

        if(Objects.nonNull(loan.getLoanCustomerName())){
            loanDB.setLoanCustomerName(loan.getLoanCustomerName());
        }
        if(Objects.nonNull(loan.getLoanAmount())){
            loanDB.setLoanAmount(loan.getLoanAmount());
        }
        if(Objects.nonNull(loan.getLoanInterest())){
            loanDB.setLoanInterest(loan.getLoanInterest());
        }
        if(Objects.nonNull(loan.getLoanDuration())){
            loanDB.setLoanDuration(loan.getLoanDuration());
        }
        return loanRepository.save(loanDB);
    }
}
