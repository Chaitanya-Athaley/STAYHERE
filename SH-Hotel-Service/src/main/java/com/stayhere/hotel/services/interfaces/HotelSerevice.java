package com.stayhere.hotel.services.interfaces;

import java.util.List;

import com.stayhere.hotel.dto.HotelDto;

public interface HotelSerevice {

	HotelDto saveHotel(HotelDto hotelDto);
	
	HotelDto getHotelByCode(String code);
	
	List<HotelDto> getHotelByCityName(String city);
}
