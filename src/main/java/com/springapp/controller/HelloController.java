package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
public class HelloController {

/*	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}*/


	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome");
		model.setViewName("index");
		return model;

	}

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Welcome");
		model.setViewName("index");
		return model;

	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "AdminPage");
		model.setViewName("index");
		return model;

	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView userPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "UserPage");
		model.setViewName("index");
		return model;

	}


	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public ModelAndView denied() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "UserPage");
		model.setViewName("index");
		return model;

	}

/*	@RequestMapping(value = "/do", method = RequestMethod.POST)
	public ModelAndView dos() {

		System.out.println("do");

		ModelAndView model = new ModelAndView();
		model.addObject("title", "UserPage");
		model.setViewName("/denied.jsp");
		return model;

	}*/


}