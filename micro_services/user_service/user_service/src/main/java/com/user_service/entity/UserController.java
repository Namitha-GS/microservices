package com.user_service.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUser(userId);
		// restTemplate.getForObject("http://localhost:9002/contact/user/"+userId, List.class);
		List contacts = 
				restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
		user.setContacts(contacts);
		return user;
	}
}
