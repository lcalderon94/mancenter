package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTittleController {

	@GetMapping("/job-title")
	public String getJobTitle() {
		return "JobTitle";
	}
}
