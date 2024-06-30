package com.SaveTravel.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.SaveTravel.demo.models.Travel;
import com.SaveTravel.demo.services.TravelService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

	private final TravelService travelService;

	public HomeController(TravelService travelService) {
		this.travelService = travelService;
	}
	
	
	 @GetMapping("/travels")
	    public String newTrip(@ModelAttribute("travel") Travel travel, HttpSession session) {
		 	List<Travel> trvl = travelService.showAllActivities();
		 	session.setAttribute("travels", trvl);
	        return "travels.jsp";
	 }
	 
    @PostMapping("/addtravel")
    public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "travels.jsp";
        } 
        else {
        	travelService.addtrip(travel);
            return "redirect:/travels";
        }
    }
	
        @GetMapping("/edit/{id}")
    	public String edit(@PathVariable Long id, Model model) {
        	Travel b= travelService.findTravel(id);
    		model.addAttribute("travel",b);
    		return "edit.jsp";
    	}
    	 @PutMapping(value="/edit/{id}/editing")
    	    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
    	        if (result.hasErrors()) {
    	            model.addAttribute("travel", travel);
    	            return "edit.jsp";
    	        } else {
    	        	travelService.updateTravel(travel);
    	            return "redirect:/travels";
    	        }
    	    }
	    @DeleteMapping("/delete/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	    	travelService.deleteExpense(id);
	        return "redirect:/travels";
	    }


    }

