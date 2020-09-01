package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) 
	{
		//sending data to view (jsp page)
		String myName = " John Abhilash";
		
		model.addAttribute("myNameValue", myName);
		model.addAttribute("myWebsiteTitle", "JOHN's CAFE");
		return "welcom-page";
	}

}
