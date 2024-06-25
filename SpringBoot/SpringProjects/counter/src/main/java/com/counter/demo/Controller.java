package com.counter.demo;
import org.springframework.web.bind.annotation.RequestMapping;

//... package and other imports you may have
import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
	// ...
		@RequestMapping("/")
		public String index(HttpSession session) {
			
	    	// If the count is not already in session
			if (session.getAttribute("count") == null) {
				session.setAttribute("count", 0);

			}
			else {
				int x = (int)session.getAttribute("count");
				x++;
				session.setAttribute("count", x);


			}
			return "index.jsp";
		}
		@RequestMapping("/two")
		public String addTwo(HttpSession session) {
			
	    	// If the count is not already in session
			if (session.getAttribute("count") == null) {
				session.setAttribute("count", 2);

			}
			else {
				int x = (int)session.getAttribute("count");
				x+=2;
				session.setAttribute("count", x);


			}
			return "addtwo.jsp";
		}
		@RequestMapping("/counter")
		public String count(HttpSession session) {
			
		return "counter.jsp";
		}
		@RequestMapping("/reset")
		public String reset(HttpSession session) {
			session.setAttribute("count", 0);
		return "counter.jsp";
		}

	// ...

	}
//...



