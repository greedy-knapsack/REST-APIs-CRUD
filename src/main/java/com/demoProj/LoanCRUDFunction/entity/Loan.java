package com.demoProj.LoanCRUDFunction.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loanId;
    private String loanCustomerName;
    private Long loanAmount;
    private Float loanInterest;
    private Long loanDuration;
}
