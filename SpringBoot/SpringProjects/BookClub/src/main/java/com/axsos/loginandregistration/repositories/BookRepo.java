package com.axsos.loginandregistration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.loginandregistration.models.Book;


@Repository
public interface BookRepo extends CrudRepository<Book, Long>{

	public List<Book> findAll();
}
