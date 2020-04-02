package com.udit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		System.out.println("index being called");
		return "index";
	}

	@PostMapping("/home")
	public ModelAndView home(@RequestParam(value = "name") String name) {
		System.out.println("home being called");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;
	}

}
