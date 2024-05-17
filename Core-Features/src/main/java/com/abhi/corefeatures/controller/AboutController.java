package com.abhi.corefeatures.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {
	
	@GetMapping("/features")
	public String getFeatures() {
		return "1. Adding application Startup banner by anding banner.txt file in claspath<br><hr>"
				+ "Add here";
	}

}
