package com.dpv.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daickichi")
public class MyControl {

	@RequestMapping("")
    public String wel() {
        return "Welcome!";}
	
	@RequestMapping("/today")
    public String hello() {
        return "Today you will find luck in all your endeavors!";
}
	@RequestMapping("/tomorrow")
    public String tom() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'.";}
	
	@RequestMapping("/travel/{dest}")
    public String travel(@PathVariable("dest") String dest) {
        return "Congratulations! You will soon travel to " + dest + "!";}
	
	@RequestMapping("/loto/{digit}")
    public String loto(@PathVariable("digit") int digit) {
		if(digit%2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
        return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";}
}

