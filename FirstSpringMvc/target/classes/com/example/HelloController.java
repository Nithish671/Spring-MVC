package com.example;

import org.springframework.stereoType.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	
	public String dislay() {
		return "index";
	}
}
