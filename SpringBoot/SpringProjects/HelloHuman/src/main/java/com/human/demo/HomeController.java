package com.human.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String hello(@RequestParam(value="name", required=false) String fname, @RequestParam(value="lname", required=false) String lname, @RequestParam(value="times", required=false) String numb){
    	StringBuilder result = new StringBuilder();
    	if(fname == null && lname == null) {
    	return "Hello Human";
    	}
    	
    	for(int i =0 ; i<Integer.parseInt(numb); i++) {
    		result.append("Hello " + fname + " " + lname + " ") ;
    	}
    	return result.toString();
    	}
       
    }
    

