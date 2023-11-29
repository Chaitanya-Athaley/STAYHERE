package com.stayhere.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayhere.user.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	private static User getUserDetails() {
		User user = new User(1,"Ram","Naresh");
		return user;
	}
	
	@GetMapping("/")
	private static List<User> getAllUserDetails() {
		List<User> list = new ArrayList<>();
		list.add(new User(1,"Ram","Naresh"));
		list.add(new User(2,"Ram kaa","Naresh"));
		list.add(new User(3,"Ram Bhi","Naresh"));
		list.add(new User(4,"Ram Ji","Naresh"));
		list.add(new User(5,"Ram HI","Naresh"));
		list.add(new User(1,"Ram","Naresh"));
		list.add(new User(1,"Ram","Naresh"));
		return list;
	}
}
