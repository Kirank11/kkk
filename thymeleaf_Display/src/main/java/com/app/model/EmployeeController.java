package com.app.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Employee;
import com.app.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeservice;
	
	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
	}
	
	
	@RequestMapping("/viewemployee")
	public String vieStudent(Model model)
	{
		List<Employee> l = employeeservice.findAll();
		model.addAttribute("employee", l);
		return "display";
	}
}
