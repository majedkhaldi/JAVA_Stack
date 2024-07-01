package com.DojosAndNinjas.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.DojosAndNinjas.demo.models.Dojo;
import com.DojosAndNinjas.demo.services.DojoService;


@Controller
public class DojoController {
	@Autowired
	DojoService dojoservice;
	
	@GetMapping("/dojo")
	public String dojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo/index.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String postMethodName(@ModelAttribute("dojo") Dojo dojo) {
		dojoservice.createDojo(dojo);
		
		return "redirect:/dojo";
	}
	
	@GetMapping("/dojo/{dojoId}/ninjas")
	public String allNinjas(@PathVariable("dojoId") Long dojoid , Model model) {
		Dojo thisdojo = dojoservice.findById(dojoid);
		model.addAttribute("thisdojo", thisdojo);
		return "dojo/showninjas.jsp";
		
	}
	
	

}
