package com.stayhere.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stayhere.hotel.entity.HotelEntity;

public interface HotelRepo extends JpaRepository<HotelEntity, Long>{

	HotelEntity findByHotelCode(String hotelCode);
	
	List<HotelEntity> findByHotelCity(String hotelCity);
}
