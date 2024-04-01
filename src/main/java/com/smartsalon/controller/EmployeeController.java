package com.smartsalon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartsalon.entity.EmployeeEntity;
import com.smartsalon.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	
//	  To get employee page and all employee on page   -  get employee page  ********************************
	@GetMapping("/employee")
	public String employee(Model model) {
		model.addAttribute("employeeEntity", employeeService.getAllEmployee());
		return "EmployeeTemplates/employeePage";
	}
	
	
//	 add employee below two methods *************************************
	@GetMapping("/addEmployee")
	public String addEmployee(Model model) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		model.addAttribute("employeeEntity", employeeEntity);
		return "EmployeeTemplates/addEmployee";
		
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute("employeeEntity") EmployeeEntity employeeEntity) {
		
		employeeService.saveEmployee(employeeEntity);
		return "redirect:/employee";
	}
	
	
	
//	 update employee below two method *************************************
	
	
	
	@GetMapping("/employee/edit/{id}")
	public String editEmployee(@PathVariable int id, Model model) {
		System.out.println("**********************************-----------------------------");
		model.addAttribute(employeeService.getEmployeeById(id));
		return "EmployeeTemplates/editEmployee";
	}
	@PostMapping("/employee/{id}")
	public String employee(@PathVariable("id") int id, @ModelAttribute("employeeEntity") EmployeeEntity employeeEntity) {
		
		EmployeeEntity employee = employeeService.getEmployeeById(id);
		
		employee.setEmployeeFirstName(employeeEntity.getEmployeeFirstName());
		employee.setEmployeeLastName(employeeEntity.getEmployeeLastName());
		employee.setEmployeeEmail(employeeEntity.getEmployeeEmail());
		employee.setEmployeeMobile(employeeEntity.getEmployeeMobile());
		
		employeeService.saveEmployee(employee);
		
		return "redirect:/employee";
	}
	
	
//	 delete employeee ***************************************************
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employee";
	}
}
