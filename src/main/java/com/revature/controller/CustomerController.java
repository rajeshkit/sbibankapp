package com.revature.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Customer;

@RestController
public class CustomerController {
	@GetMapping("/greet")
	public String welcome() {
		
		return "welcome to revature";
	}
	@GetMapping("/greeting")
	public String invite() {
		
		return "greeting to you";
	}
	@GetMapping("/statement")
	public String getStatement() {
		return "your statement is ready";
	}
	
	
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		
		return Arrays.asList(new Customer(100, "rajesh"),new Customer(101, "vijay"));
	}
	@GetMapping("/test")
	public String tests() {
		
		return "test is done";
	}
}
