package com.restService.example.rest;

import java.util.List;
import java.util.stream.Collectors;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restService.example.Service.BookService;
import com.restService.example.model.Book;

@RestController
@RequestMapping("Ram/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/all")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	@GetMapping("/{authorId}")
	public List<Book> getBooksByAuthor(@PathVariable("authorId") String authorId) {
		List<Book> books = bookService.getBooksByAuthor(authorId);
		return books;
	}

	@GetMapping
	public List<Book> getBooksByTitle(@RequestParam("partialTitle") String partialTitle) {
		List<Book> books = bookService.getBooksByTitle(partialTitle);
		return books;
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		Book newRecord = bookService.create(book);
		return newRecord;
	}
}
