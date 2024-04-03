package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/reservation")
@Controller
public class ResController {
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model m) {
		
		Reservation res = new Reservation();
		
		m.addAttribute("reservation", res);
		
		return "reservationPage";
	} 
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		
		return "confirmationPage";
		
	}
	
}
