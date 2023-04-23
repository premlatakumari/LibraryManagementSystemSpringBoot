package com.bookStore.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookStore.book.entity.Book;
import com.bookStore.book.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	@GetMapping("/")
	public String home()
	{
		return "home";
		
	}
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	@GetMapping("/available_book")
	public String getAllBook() {
		return "bookList";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		
		return "redirect:/available_book";
	}

}
