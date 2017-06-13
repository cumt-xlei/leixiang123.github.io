package com.lei.entity;

import java.time.LocalDateTime;

public class Loan {
	private String id;
	private LocalDateTime loanDate;
	private LocalDateTime dateForReturn;
	private LocalDateTime returnDate;
	private Book book;
	private Member member;
	
	
	public boolean hasNotBeenReturned(){
		return returnDate == null;
	}
	public void markAsReturn(){
		returnDate = LocalDateTime.now();
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		this.loanDate = loanDate;
	}
	public LocalDateTime getDateForReturn() {
		return dateForReturn;
	}
	public void setDateForReturn(LocalDateTime dateForReturn) {
		this.dateForReturn = dateForReturn;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "借书记录信息 [借出时间:" + loanDate + ", 应还时间:" + dateForReturn + ", 实还时间:"
				+ returnDate + ", 书籍标题:" + book.getTitle() + ", 借书人:" + member.getName() + "]";
	}
	
	
	
}
