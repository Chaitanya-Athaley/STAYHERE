package com.stayhere.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayhere.hotel.dto.HotelDto;
import com.stayhere.hotel.services.interfaces.HotelSerevice;

@RestController
@RequestMapping("api/hotels")
public class HotelController {

	@Autowired
	private HotelSerevice hotelSerevice;
	
	/**
	 * @param hotelDto
	 * @return ResponseEntity<HotelDto>
	 */
	@PostMapping
	public ResponseEntity<HotelDto> saveHotelInDB(@RequestBody HotelDto hotelDto){
		HotelDto saveHotel = hotelSerevice.saveHotel(hotelDto);
		return new ResponseEntity<HotelDto>(saveHotel, HttpStatus.CREATED);
	}
	
}
