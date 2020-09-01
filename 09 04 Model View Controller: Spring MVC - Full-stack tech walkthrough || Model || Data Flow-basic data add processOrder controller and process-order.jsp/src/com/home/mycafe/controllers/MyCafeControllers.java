package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	//Return the welcom-page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) 
	{
		
		return "welcom-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder()
	{
		return "process-order";
	}

}
