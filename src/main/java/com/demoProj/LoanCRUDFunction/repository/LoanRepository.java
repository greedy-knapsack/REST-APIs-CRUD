package com.demoProj.LoanCRUDFunction.repository;

import com.demoProj.LoanCRUDFunction.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
