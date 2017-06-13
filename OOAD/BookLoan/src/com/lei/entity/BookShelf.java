package com.lei.entity;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private String author;
	private String type;
	
	private List<Book> books;
	
	public BookShelf(String author, String type){
		this.author = author;
		this.type = type;
		books = new ArrayList<>();
	}
	public void addBook(Book book){
		if( validate(book) ){			
			books.add(book);
		}
	}
	
	private boolean validate(Book book){
		AuthorSpecification as = new AuthorSpecification(author);
		TypeSpecification ts = new TypeSpecification(type);
		return ( as.isSatisfiedBy(book) && ts.isSatisfiedBy(book) );
	}
	
	public List<Book> getBooks() {
		return books;
	}

}
