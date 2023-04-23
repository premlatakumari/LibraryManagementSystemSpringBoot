package com.bookStore.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.book.entity.Book;
import com.bookStore.book.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bRepo;
	public void save(Book b) {
		bRepo.save(b);
		
	}

}
