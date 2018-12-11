package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloWorldController {
	
	// need a controller method to show the initial html form

	
	// need a controller method to precess the html form

	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld";
	}
	
	
	// new controller mthord to read form data and add data to the model
	
	@RequestMapping("/processFormVersion2")
	public String shoutDude(HttpServletRequest request, Model model) {
		
		// read the request
		String theName = request.getParameter("studentName");
		
		// convert to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		
		
		return "helloworld";
	}
	
	
}
