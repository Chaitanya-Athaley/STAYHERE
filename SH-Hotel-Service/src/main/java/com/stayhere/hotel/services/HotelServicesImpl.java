package com.stayhere.hotel.services;

import org.springframework.stereotype.Service;

import com.stayhere.hotel.dto.HotelDto;
import com.stayhere.hotel.entity.HotelEntity;
import com.stayhere.hotel.repository.HotelRepo;
import com.stayhere.hotel.services.interfaces.HotelSerevice;

import lombok.AllArgsConstructor;

/**
 * @author Chaitanya
 * 
 * @apiNote
 * created parameter constructor. not use autowired, 
 * because for one varibale in class. it will create bean automatically
 * . i used constructor setter injuction 
 *
 */
@Service
@AllArgsConstructor
public class HotelServicesImpl implements HotelSerevice{
	
	private HotelRepo hotelRepo;

	/**
	 *Convert DTO to Entity and  Save it  to  DB
	 *and return savedDTO object
	 */
	@Override
	public HotelDto saveHotel(HotelDto hotelDto) {
		// convert hotel dto to hotel jpa entity
		HotelEntity hotel = new HotelEntity(hotelDto.getId(),
				hotelDto.getHotelName(), hotelDto.getHotelDescription(),
				hotelDto.getHotelCode(), hotelDto.getHotelCity());
		
		HotelEntity savedHotel = hotelRepo.save(hotel);
		
		// conver entity to DTo
		HotelDto savedHotelDto = new HotelDto(savedHotel.getId(), savedHotel.getHotelName(), savedHotel.getHotelDescription(), savedHotel.getHotelCode(), savedHotel.getHotelCity());
		return savedHotelDto;
	}

	/**
	 * getHotelByCode by Hotel code
	 *
	 */
	@Override
	public HotelDto getHotelByCode(String hotelCode) {
		HotelEntity hotel = hotelRepo.findByHotelCode(hotelCode);
		HotelDto hotelDto = new HotelDto(hotel.getId(), hotel.getHotelName(), hotel.getHotelDescription(), hotel.getHotelCode(), hotel.getHotelCity());
		return hotelDto;
	}

}
