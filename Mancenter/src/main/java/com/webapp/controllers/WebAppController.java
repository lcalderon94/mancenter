package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {

	@GetMapping("/index")
	public String indx() {
		return "index";
	}
}
