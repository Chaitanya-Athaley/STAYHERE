package com.stayhere.utility;

import com.stayhere.hotel.dto.HotelDto;
import com.stayhere.hotel.entity.HotelEntity;

public class CommonUtil {

	public static HotelDto convertHotelEntitytoHotelDto(HotelEntity hotelEntity) {
		HotelDto hotelDto = new HotelDto();
		hotelDto.setId(hotelEntity.getId());
		hotelDto.setHotelName(hotelEntity.getHotelName());
		hotelDto.setHotelDescription(hotelEntity.getHotelDescription());
		hotelDto.setHotelCode(hotelEntity.getHotelCode());
		hotelDto.setHotelCity(hotelEntity.getHotelCity());
		return hotelDto;
	}
}
