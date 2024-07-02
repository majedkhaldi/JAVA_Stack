package com.axsos.loginandregistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.loginandregistration.models.Book;
import com.axsos.loginandregistration.repositories.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookrepo;
	
	public Book create(Book book) {
		return bookrepo.save(book);
	}
	
	public List<Book> findAllBooks(){
		return bookrepo.findAll();
	}
	
	public Book findBookById(Long id) {
		Optional<Book> potential = bookrepo.findById(id);
		if(potential.isPresent()) {
			return potential.get();
		}
		return null;
	}
	
	public Book updateBook(Book book) {
		return bookrepo.save(book);

	}
	
	public void deleteBook(Book book) {
		bookrepo.delete(book);
	}
}
