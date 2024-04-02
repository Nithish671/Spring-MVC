package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CtrlClass {

	@RequestMapping("/hello")
	public String display(HttpServletRequest req, Model m) {
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if(name.equals("Goku") && pass.equals("kakarot")) {
			
			String msg1 = "Welcome " + name + "!";
			
			String msg2 = "Strongest Warrior In The Universe!";
			
			m.addAttribute("message", msg1);
			m.addAttribute("message1", msg2);
			
			return "viewPage";
			
		} else {
			
			String msg1 = "Sorry, " + name + "!";
			String msg2 = "You entered wrong username or wrong password!";
			
			m.addAttribute("message", msg1);
			m.addAttribute("message1", msg2);
			
			return "errorPage";
			
		}
		
	}
}
