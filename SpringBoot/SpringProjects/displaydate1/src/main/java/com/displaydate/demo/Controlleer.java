package com.displaydate.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlleer {
    @RequestMapping("/")
    public String main() {
        return "Main.jsp";
    }
    //...
    @RequestMapping("/date")
    public String date() {
        return "Date.jsp";
    }
    @RequestMapping("/time")
    public String time() {
        return "Time.jsp";
    }

}
