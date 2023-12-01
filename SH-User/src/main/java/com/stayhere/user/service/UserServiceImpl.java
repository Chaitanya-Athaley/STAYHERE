package com.stayhere.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stayhere.user.entity.UserEntity;
import com.stayhere.user.dto.APIResponseDto;
import com.stayhere.user.dto.HotelDto;
import com.stayhere.user.dto.UserDto;
import com.stayhere.user.repository.UserRepository;
import com.stayhere.user.service.interfaces.APIClient;
import com.stayhere.user.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private APIClient apiClient;
	
	@Override
	public UserDto saveUser(UserDto userDto) {
		UserEntity userEntity = new UserEntity(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
		UserEntity saveUser = userRepository.save(userEntity);
		UserDto savedUserDto = new UserDto(saveUser.getId(), saveUser.getFirstName(), saveUser.getLastName(), saveUser.getEmail()); 
		return savedUserDto;
	}

	@Override
	public APIResponseDto getUserById(Long userId) {
		UserEntity user = userRepository.findById(userId).get();
		// feign start
		String hotelCode = "10"+user.getId();
		HotelDto hotelDto = apiClient.getHotelByCode(hotelCode);
		// feign end
		UserDto userDto = new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail()); 
		APIResponseDto apiResponseDto = new APIResponseDto(userDto, hotelDto);
		return apiResponseDto;
	}

}
