package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {

	@RequestMapping("/hello1")
	public String display() {
		return "viewPage1";
	}
}
