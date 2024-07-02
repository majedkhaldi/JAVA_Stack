package com.axsos.loginandregistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.loginandregistration.models.Book;
import com.axsos.loginandregistration.models.User;
import com.axsos.loginandregistration.services.BookService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;




@Controller
public class BookController {

	@Autowired
	BookService bookser;
	
	@GetMapping("/books")
	public String result(HttpSession session, Model model) {
		if(session.getAttribute("loggedUser") == null) {
			return "redirect:/";
		}
		model.addAttribute("books", bookser.findAllBooks());
		
		return "result.jsp";}
	
	@GetMapping("/addbookpage")
	public String addBookPage(@ModelAttribute("book") Book book, HttpSession session) {
		if(session.getAttribute("loggedUser") == null) {
			return "redirect:/";
		}
		if(session.getAttribute("loggedUser") == null) {
			return "redirect:/";
		}
		return "addbook.jsp";
	}
	
	@PostMapping("/addbook")
	public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		
		if(result.hasErrors()) {
				return "addbook.jsp"; 
			}
		
		book.setUser(session.getAttribute("loggedUser"));
		bookser.create(book);
		
		return "redirect:/addbookpage";
	}
	
	@GetMapping("/bookpage/{bookid}")
	public String showBook(@PathVariable("bookid") Long bookid, HttpSession session, Model model) {
		boolean flag = false;
		if(session.getAttribute("loggedUser") == null) {
			return "redirect:/";
		}
		
		Book thisbook = bookser.findBookById(bookid);
		User loggeduser = (User) session.getAttribute("loggedUser");
		if(thisbook.getUser().getId() == loggeduser.getId() ){
			flag = true;
		}
		model.addAttribute("thisbook",thisbook);
		model.addAttribute("flag",flag);
		return "bookdetails.jsp";
	}
	
	@GetMapping("/bookpage/{bookid}/edit")
	public String editBookPage(@PathVariable("bookid") Long bookid,@ModelAttribute("book") Book book, HttpSession session, Model model) {
		if(session.getAttribute("loggedUser") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookser.findBookById(bookid)); 
		return "editbook.jsp";
	}
	
    @RequestMapping(value="/thisbook/edit/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
        if (result.hasErrors()) {
            model.addAttribute("book", book);
            return "editbook.jsp";
        } else {
            book.setUser(session.getAttribute("loggedUser"));
            bookser.updateBook(book);
            return "redirect:/books";
        }
    }
	
	
	
}
