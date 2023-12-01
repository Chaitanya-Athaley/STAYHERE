package com.stayhere.user.service.interfaces;

import com.stayhere.user.dto.APIResponseDto;
import com.stayhere.user.dto.UserDto;

public interface UserService {

	UserDto saveUser(UserDto userDto); 
	
	APIResponseDto getUserById(Long userId);
}
