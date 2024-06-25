package com.ninjagold.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
			session.setAttribute("array",  new ArrayList<String>());
		}
		return "index.jsp";
	}
	@PostMapping("/findgold")
	public String findGold(
		@RequestParam(value="place") String place, 
		Random random, 
		HttpSession session,
		Model model
		) {
		int counter = (int) session.getAttribute("counter");
		ArrayList<String> activities=(ArrayList<String>) session.getAttribute("array");
		SimpleDateFormat dateFormat = new SimpleDateFormat("E.dd.MM.yyyy hh:mm a");
		String formattedDate = dateFormat.format(new java.util.Date());
		if(place.equals("cave")){
			int rand = random.nextInt(5,11);
			counter+=rand;
			activities.add(0,"You entered a cave and won " + rand + " coins -- " + formattedDate);
			session.setAttribute("color", "g");
		}
		if(place.equals("farm")){
			int rand = random.nextInt(10,21);
			counter+=rand;
			activities.add(0,"You entered a farm and won " + rand + " coins -- " + formattedDate);
			session.setAttribute("color", "g");


		}
		if(place.equals("house")){
			int rand = random.nextInt(2,6);
			counter+=rand;
			activities.add(0,"You entered a house and won " + rand + " coins -- " + formattedDate);
			session.setAttribute("color", "g");

		}
		if(place.equals("quest")){
			int rand = random.nextInt(-50,51);
			counter+=rand;
			if(rand>=0){
				activities.add(0,"You completed a quest and won " + rand + " coins -- " + formattedDate);
				session.setAttribute("color", "g");
			}
			else{
				activities.add(0,"You failed a quest and lost " + (-1*rand) + " coins -- " + formattedDate);
				session.setAttribute("color", "r");
			}
		}
		if(place.equals("spa")){
			int rand = random.nextInt(-20,-4);
			counter+=rand;
			activities.add(0,"You entered the spa and lost " + (-1*rand) + " coins -- " + formattedDate);
			session.setAttribute("color", "r");
			}

		session.setAttribute("array", activities);
		session.setAttribute("counter", counter);
		return "redirect:/";
	}
		@RequestMapping("/reset")
		public String reset(HttpSession session){
			session.invalidate();
			return "redirect:/";
		}


	}
