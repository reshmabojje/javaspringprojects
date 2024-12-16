package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public String saveUser(FET fetObject) {
		
		userRepository.save(fetObject);
		
		return "User Saved";
	}

	public FET getUser(int userId) {
		FET fet = userRepository.findById(userId).get();
		return fet;
	}

}
