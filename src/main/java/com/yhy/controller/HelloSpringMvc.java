package com.yhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMvc {
	
	@RequestMapping("sayHello")
	public void sayHello(Model model) {
		model.addAttribute("message", "Hello SpringMVC, I am coming!");
	}

}
