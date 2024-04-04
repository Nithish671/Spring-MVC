package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EmpDao;
import com.example.beans.Employee;

@Controller
public class EmpController {

	@Autowired
	EmpDao dao;
	
	@RequestMapping("/empForm")
	public String showForm(Model m) {
		
		m.addAttribute("command", new Employee());
		return "empForm";
		
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("e") Employee e) {
		
		dao.save(e);
		return "redirect:/viewEmp";
		
	}
	
	@RequestMapping("/viewEmp")
	public String viewEmp(Model m) {
		
		List<Employee> list = dao.getEmployees();
		m.addAttribute("list", list);
		return "viewEmp";
		
	}
	
	@RequestMapping("/editEmp/{id}")
	public String editEmp(@PathVariable int id, Model m) {
		
		Employee e = dao.getEmpById(id);
		m.addAttribute("command", e);
		return "empEditForm";
		
	}
	
	@RequestMapping(value = "/editSave", method = RequestMethod.POST)
	public String editSave(@ModelAttribute("e") Employee e) {
		
		dao.update(e);
		return "redirect:/viewEmp";
		
	}
	
	@RequestMapping(value="deleteEmp/{id}")
	public String delete(@PathVariable int id) {
		
		dao.delete(id);
		return "redirect:/viewEmp";
		
	}
	
}
