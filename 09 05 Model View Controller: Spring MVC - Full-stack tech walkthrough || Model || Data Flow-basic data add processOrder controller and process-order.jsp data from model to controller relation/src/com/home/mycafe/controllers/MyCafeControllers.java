package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

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
	public String processOrder(HttpServletRequest request, Model model)
	{
		//handle data receive from the user
		String userEnterValue = request.getParameter("foodType");
		
		//adding the captured value to the model
		model.addAttribute("userInput", userEnterValue );
		
		//set the user data with the model object and send it to view	
		return "process-order";
	}

}
