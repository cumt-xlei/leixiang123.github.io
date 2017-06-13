package com.lei.entity;

/**
 * 书籍类
 * @author 雷祥
 *
 */
public class Book {
	private String id;
	private String author;
	private String type;
	private String ISBN;
	private String title;
	private Member loanTo;
	
	/**
	 * 构造函数，初始化书籍信息
	 * @param author
	 * @param type
	 * @param ISBN
	 * @param title
	 */
	public Book(String author, String type, String ISBN, String title){
		this.author = author;
		this.type = type;
		this.ISBN = ISBN;
		this.title = title;
	}
	
	
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public final String getISBN() {
		return ISBN;
	}
	public final void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return loanTo;
	}
	public void setLoanTo(Member loanTo) {
		this.loanTo = loanTo;
	}
	

}
