package com.stayhere.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stayhere.user.entity.UserEntity;
import com.stayhere.user.model.UserDto;
import com.stayhere.user.repository.UserRepository;
import com.stayhere.user.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDto saveUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
		UserEntity saveUser = userRepository.save(userEntity);
		UserDto savedUserDto = new UserDto(saveUser.getId(), saveUser.getFirstName(), saveUser.getLastName(), saveUser.getEmail()); 
		return savedUserDto;
	}

}
