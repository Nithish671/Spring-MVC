package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CtrlClass {

	@RequestMapping("/hello")
	public String display(@RequestParam("name") String name, @RequestParam("pass") String pass, Model m) {
		
		if(name.equals("Goku") && pass.equals("Kakarot")) {
			
			String msg1 = "Welcome " + name + "!";
			
			String msg2 = "Strongest Warrior In The Universe!";
			
			m.addAttribute("message1", msg1);
			
			m.addAttribute("message2", msg2);
			
			return "viewPage";
			
		} else {
			
			String msg1 = "Sorry, Goku!";
			
			String msg2 = "You entered wrong username or wrong password!";
			
			m.addAttribute("message1", msg1);
			
			m.addAttribute("message2", msg2);
			
			return "errorPage";
		}
	}
}
