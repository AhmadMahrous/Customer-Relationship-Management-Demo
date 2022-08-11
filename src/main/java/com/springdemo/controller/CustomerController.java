package com.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.dao.CustomerDAO;
import com.springdemo.entity.Customer;
import com.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject customer service into the controller
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
			
		// get customers from service 
		List<Customer> customers = customerService.getCustomers();
		
		// add customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customer";
	}
}
