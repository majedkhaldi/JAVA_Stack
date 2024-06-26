package com.fruits.demo;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruits.demo.models.Item;


@org.springframework.stereotype.Controller
public class Controller {

	    
	    @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 1.5));
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Goji Berries", 4.0));
	        fruits.add(new Item("Guava", .75));
	        
	        model.addAttribute("allfruits", fruits);

	        
	        // Add fruits to your view model here
	        
	        return "Index.jsp";
	    }
	}



