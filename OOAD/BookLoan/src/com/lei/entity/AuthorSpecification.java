package com.lei.entity;

public class AuthorSpecification implements Specification<Book> {
	
	private String author;
	public AuthorSpecification(String author){
		this.author = author;
	}
	
	@Override
	public boolean isSatisfiedBy(Book book){
		return ( book.getAuthor().equals(author) );
	}

}
