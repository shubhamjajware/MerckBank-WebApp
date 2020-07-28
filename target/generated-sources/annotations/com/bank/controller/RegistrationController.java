package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.model.User;

@Controller
public class RegistrationController {
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("register");
		mv.addObject("user",new User());
		
		return mv;
	}
	
	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)

	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,

	  @ModelAttribute("user") User user) {

	  userService.register(user);

	  return new ModelAndView("welcome", "firstname", user.getFirstname());

	  }

}
