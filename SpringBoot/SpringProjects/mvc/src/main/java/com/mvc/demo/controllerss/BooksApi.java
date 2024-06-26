// ..
package com.mvc.demo.controllerss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.demo.models.Book;
import com.mvc.demo.services.BookService;

@Controller
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
   }
    
    
//	@Autowired
//	BookService bookService;
    // other methods removed for brevity
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
    	Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }

    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    @GetMapping("book/{id}")
    public String rend(@PathVariable("id") Long id, Model model) {
    	Book bk = bookService.findBook(id);
    	model.addAttribute("title",bk.getTitle());
    	model.addAttribute("desc",bk.getDescription());
    	model.addAttribute("lang",bk.getLanguage());
    	model.addAttribute("pages",bk.getNumberOfPages());

    	return "index.jsp";
    }
    
    
}
