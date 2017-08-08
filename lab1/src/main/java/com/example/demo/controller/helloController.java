package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

	@RequestMapping("/")
	public String hi(String name, Model m) {
		m.addAttribute("name", name);
		return "hello";
	}
}
