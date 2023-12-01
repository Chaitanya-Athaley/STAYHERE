package com.stayhere.user.service.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.stayhere.user.dto.HotelDto;

@FeignClient(url = "http://localhost:8080", value = "HOTEL-SERVICE")
public interface APIClient {

	@GetMapping("api/hotels/{hotel-code}")
	HotelDto getHotelByCode(@PathVariable("hotel-code") String hotelCode);

}
