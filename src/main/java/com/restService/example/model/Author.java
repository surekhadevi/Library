package com.restService.example.model;

public class Author {

	 String AuthorId ;
     String Name ;
     String EmailAddress ;
     
     public Author() {
    	 
     }
     
	public Author(String AuthorId, String name, String emailAddress) {
		super();
		this.AuthorId = AuthorId;
		Name = name;
		EmailAddress = emailAddress;
	}
	public String getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(String AuthorId) {
		this.AuthorId = AuthorId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
     
}
