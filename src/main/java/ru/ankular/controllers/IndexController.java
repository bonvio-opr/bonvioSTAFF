package ru.ankular.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}


	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String method403() {
		return "403";
	}
}