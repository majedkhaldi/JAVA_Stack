package com.DojosAndNinjas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.DojosAndNinjas.demo.models.Dojo;
import com.DojosAndNinjas.demo.models.Ninja;
import com.DojosAndNinjas.demo.services.DojoService;
import com.DojosAndNinjas.demo.services.NinjaService;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class NinjaController {

	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService dojoService;
	
	@GetMapping("/ninja")
	public String ninjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> d = dojoService.findAllDojos();
		model.addAttribute("dojos", d);
		return "ninja/index.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninjaService.createNinja(ninja);
		return "redirect:/ninja";
	}
	
	
}
