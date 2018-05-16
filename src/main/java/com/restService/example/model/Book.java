package com.restService.example.model;

public class Book {

	String Id;
	String Title;
	Author author;
	String ISBN;

	public Book() {
		
	}
	
	public Book(String id, String title, Author author, String iSBN) {
		super();
		Id = id;
		Title = title;
		this.author = author;
		ISBN = iSBN;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
