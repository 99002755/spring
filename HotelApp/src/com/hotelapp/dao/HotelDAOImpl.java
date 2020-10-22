package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		for(Hotel hotel : showHotelList()) {
			if(hotel.getHotelId() == id)
				return hotel;
		}
		return null;
	}

	@Override
	public List<Hotel> getCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCity() == city) {
				newHotelList.add(hotel);
			}
		}
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getCuisine() == cuisine) {
				newHotelList.add(hotel);
			}
		}
		return showHotelList();
	}

	private List<Hotel> showHotelList()
	{
		return Arrays.asList(
				new Hotel(1,"Annapoorna","cbe","Indian"),
				new Hotel(2,"Annandhas","chennai","Indian"),
				new Hotel(3,"KFC","bangalore","NV"),
				new Hotel(4,"bbq","cbe","bbq")

				);
	}


}