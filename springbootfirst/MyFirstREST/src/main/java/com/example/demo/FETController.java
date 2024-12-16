package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FETController {


	@Autowired
	UserService userService;

	@PostMapping("/save-user")
	public String saveFETUserData(@RequestBody FET fet) {
		System.out.println("Incoming object is " + fet);
		return userService.saveUser(fet);
	}
	
	@GetMapping("/users/{userId}")
	public FET getFETUserData(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}

}
