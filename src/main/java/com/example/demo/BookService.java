package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

@Autowired	
public 	BookRepository bookrepository;

public List<Book> getAllBook() {
	List<Book>book =new ArrayList<>();
	bookrepository.findAll().forEach(book1 -> book.add(book1));
	return book;
}

public Book getBookById(int bookid) {
	// TODO Auto-generated method stub
	return bookrepository.findById(bookid).get();
}

public void update(Book book) {

	bookrepository.save(book);
	
}

public void updatebook(Book book) {
	bookrepository.save(book);
	
}

public void deleteBookById(int bookid) {
	bookrepository.deleteById(bookid);
	
}



}
