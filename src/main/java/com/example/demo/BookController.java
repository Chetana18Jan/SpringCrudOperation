package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	
	@GetMapping("/book")
	public List<Book>getAllBook()
	{
		return bookservice.getAllBook();
	}

	@GetMapping("/book/{bookid}")
	public Book getBookById(@PathVariable ("bookid") int bookid)
	{
		return bookservice.getBookById(bookid);
		
	}
	@PostMapping("/books")
	public int saveBook(@RequestBody Book book)
	{
		bookservice.update(book);
		return book.getBookid();
		
	}
	@PutMapping("/updatebook")
	public Book update(@RequestBody Book book)
	{
		bookservice.updatebook(book);
		return book;
		
	}
	@DeleteMapping("/deletebookid/{bookid}")
	public void deletebook(@PathVariable("bookid") int bookid)
	{
		bookservice.deleteBookById(bookid);
	}
}
