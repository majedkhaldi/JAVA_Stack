package com.burgerTracker.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.burgerTracker.demo.models.Burger;
import com.burgerTracker.demo.services.BurgerServices;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	private final BurgerServices burgerService;

	public HomeController(BurgerServices burgerService) {
		this.burgerService = burgerService;
	}
	
	
	 @GetMapping("/burgers")
	    public String newBurger(@ModelAttribute("burger") Burger burger, HttpSession session) {
		 	List<Burger> brgr = burgerService.showAllBurgers();
		 	session.setAttribute("burgers", brgr);
	        return "burgers.jsp";
	 }
	 
    @PostMapping("/addburger")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "burgers.jsp";
        } 
        else {
        	burgerService.addburger(burger);
            return "redirect:/burgers";
	
}
    }
}
