package com.lei.entity;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String id;
	private String name;
	private List<Loan> loans;
	public Member(String name){
		this.name = name;
		loans = new ArrayList<>();
	}
	
	public void Return(Book book){
		Loan loan = findCourrentLoanFor(book);
		loan.markAsReturn();
		book.setLoanTo(null);
	}
	public boolean canLoan(Book book){
		return book.getLoanTo() == null;
	}
	
	public Loan loan(Book book){
		
		Loan loan = null;
		if(canLoan(book)){			
			loan = LoanFactory.createLoan(book, this);
			loans.add(loan);
		}
		return loan;
	}
	public Loan findCourrentLoanFor(Book book){
		Loan loanHistory = null;
		for (Loan loan : loans) {
			if(loan.getBook() == book){
				loanHistory = loan;
			}
		}
		return loanHistory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	
	
}
