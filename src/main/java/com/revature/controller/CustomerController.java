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
		System.out.println("welcome");
		return "welcome to revature";
	}
	@GetMapping("/greeting")
	public String invite() {
		System.out.println("invite");
		return "greeting to you";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		System.out.println("welocme customer");
		return Arrays.asList(new Customer(100, "rajesh"),new Customer(101, "vijay"));
	}
	@GetMapping("/test")
	public String tests() {
		return "test is done";
	}
}
