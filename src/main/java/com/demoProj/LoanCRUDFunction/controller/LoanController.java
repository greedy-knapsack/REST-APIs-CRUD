package com.demoProj.LoanCRUDFunction.controller;

import com.demoProj.LoanCRUDFunction.entity.Loan;
import com.demoProj.LoanCRUDFunction.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    private LoanService loanService;
    @PostMapping("/loans")
    public Loan saveLoan(@RequestBody Loan loan){
        return loanService.saveLoan(loan);
    }
    @GetMapping("/loans")
    public List<Loan> FetchAllLoans(Loan loan){
        return loanService.fetchAllLoans(loan);
    }
    @GetMapping("/loans/{id}")
    public Loan fetchLoanById(@PathVariable("id") Long LoanId){
        return loanService.fetchLoanById(LoanId);
    }
    @DeleteMapping("/loans/{id}")
    public String deleteLoan(@PathVariable("id") Long LoanId){
        loanService.deleteLoan(LoanId);
        return "Loan deleted successfully!";
    }
    @PutMapping("/loans/{id}")
    public Loan updateLoan(@PathVariable("id") Long LoanId,@RequestBody Loan loan){
        return loanService.updateLoan(LoanId,loan);
    }
}
