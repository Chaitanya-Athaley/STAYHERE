package com.stayhere.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIResponseDto {

	private UserDto userDto;
	private HotelDto hotelDto;
}
