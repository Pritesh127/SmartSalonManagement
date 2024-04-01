package com.smartsalon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.smartsalon.entity.CustomerEntity;
import com.smartsalon.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	public CustomerService customerService;
	
	
//for showing customer page and get data from database ******************************
	@GetMapping("/customer")
	public String customer(Model model) {
		model.addAttribute("customerEntity", customerService.getAllCustomer());
		return "CustomerTemplates/customerPage";
	}
	
	
//	for adding or save new customer details ************************** below two methods used
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		
		CustomerEntity customerEntity = new CustomerEntity();
		model.addAttribute("customerEntity", customerEntity);
		return "CustomerTemplates/addCustomer";
	}
	
	@PostMapping("/addCustomer")
	public String Customer(@ModelAttribute("customerEntity") CustomerEntity customerEntity) {
		customerService.saveCustomer(customerEntity);
		return "redirect:/customer";
	}
	
	
	
//	to edit customer below two method used *********************************
	
	@GetMapping("/customer/edit/{id}")
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customerEntity",customerService.getCustomerById(id));
		return "CustomerTemplates/editCustomer";
	}
	
	@PostMapping("/customer/{id}")
	public String editCustomer(@PathVariable("id") int id,@ModelAttribute("customerEntity") CustomerEntity customerEntity) {
		
		CustomerEntity customer = customerService.getCustomerById(id);
		
		customer.setCustomerFirstName(customerEntity.getCustomerFirstName());
		customer.setCustomerLastName(customerEntity.getCustomerLastName());
		customer.setCustomerEmail(customerEntity.getCustomerEmail());
		customer.setCustomerMobile(customerEntity.getCustomerMobile());
		
		customerService.saveCustomer(customer);
		
		return "redirect:/customer";
		
	}
	
	
//	to delete customer ************************************
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customer";
	}
	
}
