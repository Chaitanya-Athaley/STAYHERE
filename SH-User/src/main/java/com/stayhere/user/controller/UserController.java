package com.stayhere.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayhere.user.model.UserDto;
import com.stayhere.user.service.interfaces.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
//	@GetMapping("/user")
//	private static UserDto getUserDetails() {
//		UserDto user = new UserDto((long) 1,"Ram","Naresh","ram@gmail.com");
//		return user;
//	}
	
//	@GetMapping("/")
//	private static List<UserDto> getAllUserDetails() {
//		List<UserDto> list = new ArrayList<>();
////		list.add(new User(1,"Ram","Naresh"));
////		list.add(new User(2,"Ram kaa","Naresh"));
//		return list;
//	}
	
	/**
	 * @param userDto
	 * @return
	 */
	@PostMapping
	private ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
		UserDto savedUser = userService.saveUser(userDto);
		return new ResponseEntity<UserDto>(savedUser, HttpStatus.CREATED);
	}
}
