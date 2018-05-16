package com.restService.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restService.example.model.Author;
import com.restService.example.model.Book;

@Service
public class BookService {

	static final List<Book> BOOKS = new ArrayList<>();

	public List<Book> getBooks() {
		Book book1 = new Book("1", "Java", new Author("1", "Ram", "Ram123@gmail.com"), "234");
		Book book2 = new Book("2", "Spring", new Author("2", "Sharath", "Sharath123@gmail.com"), "535");
		Book book3 = new Book("3", "Hibernate", new Author("3", "Jay", "Jay123@gmail.com"), "6456");
		Book book4 = new Book("4", "Microservices", new Author("4", "Lokesh", "Lokesh123@gmail.com"), "6575");
		BOOKS.add(book1);
		BOOKS.add(book2);
		BOOKS.add(book3);
		BOOKS.add(book4);
		return BOOKS;
	}
	
	public List<Book> getBooksByAuthor(String authorId){
		List<Book> bookList = BOOKS.stream().filter(b -> b.getAuthor().getAuthorId().equals(authorId))
				.collect(Collectors.toList());
		return bookList;
	}
	
	public List<Book> getBooksByTitle(String partialTitle){
		List<Book> bookList = BOOKS.stream().filter(b -> b.getTitle().contains(partialTitle))
				.collect(Collectors.toList());
		return bookList;
	}
	public Book create(Book book){
		BOOKS.add(book);
		return book;
	}
	

}
