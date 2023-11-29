package com.stayhere.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {

	private Long id;
	private String hotelName;
	private String hotelDescription;
	private String hotelCode;
	private String hotelCity;
	
}
