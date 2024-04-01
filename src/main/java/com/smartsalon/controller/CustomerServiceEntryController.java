package com.smartsalon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.smartsalon.entity.ProductEntity;
import com.smartsalon.service.CustomerService;
import com.smartsalon.service.CustomerServiceEntryService;
import com.smartsalon.service.EmployeeService;
import com.smartsalon.service.ProductService;

@Controller
public class CustomerServiceEntryController {
	
	@Autowired
	public CustomerServiceEntryService customerServiceEntryService;
	
	@Autowired
	public CustomerService customerService;
	
	@Autowired
	public EmployeeService employeeService;
	
	@Autowired
	public ProductService productService;

	@GetMapping("/customerEntry")
	public String customer(Model model) {
		model.addAttribute("customerServiceEntryService",customerServiceEntryService.getAllCustomerEntry());
		return "CustomerServiceEntryTemplates/customerServiceEntryPage";
	}
	
	@GetMapping("/addCustomerEntry")
	public String customerEntry(Model model) {
		model.addAttribute("customerEntity",customerService.getAllCustomer());
		model.addAttribute("employeeEntity",employeeService.getAllEmployee());
		model.addAttribute("productEntity",productService.getAllProducts());
		return "CustomerServiceEntryTemplates/addCustomerEntry";
	}
	

	
//	delete customer entry *****************************************************************************************
	
	@GetMapping("/deleteCustomerEntry/{id}")
	public String deleteEntry(@PathVariable("id") int id) {
		customerServiceEntryService.deleteEntry(id);
		return "redirect:/customerEntry";
	}
}
