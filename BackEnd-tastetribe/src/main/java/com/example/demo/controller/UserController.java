package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {

	
	// get all Users
	@GetMapping("/User/API1")
	public String getAllUsers() {
		String msg = "Calling API 1";
		
		System.out.println(msg);
		
		return msg;
		
	}

	// create a new User
	@PostMapping("/User/API2")
	public String createSupplyRequest() {
		String msg = "Calling API 2";
		
		System.out.println(msg);
		
		return msg;

	}

	// get User by ID
	@GetMapping("/User/API3")
	public String getUserById() {
		String msg = "Calling API 3";
		
		System.out.println(msg);
		
		return msg;
	}
	
}
