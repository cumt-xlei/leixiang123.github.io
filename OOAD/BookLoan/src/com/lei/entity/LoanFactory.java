package com.lei.entity;

import java.time.LocalDateTime;

public class LoanFactory {
	
	public static Loan createLoan(Book book, Member member){
		LocalDateTime now = LocalDateTime.now();
		Loan loan = new Loan();
		loan.setBook(book);
		loan.setMember(member);
		loan.setLoanDate(now);
		loan.setDateForReturn(now.plusDays(10));
		
		return loan;
	}

}
