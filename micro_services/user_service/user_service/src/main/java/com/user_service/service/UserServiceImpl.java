package com.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			 new User(101L, "ABC", "123456789"),
			 new User(102L, "KLM", "98808"),
			 new User(103L, "XYZ", "95355")
			);

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
