package com.capgemini.hotelreservation;
import java.util.*;

public class HotelUtility {
	public static List<Hotel> hotelList=new ArrayList<>();
	
	public static void addHotel(String hotelName,int hotelRateRegularCustomer) {
		Hotel hotel=new Hotel(hotelName,hotelRateRegularCustomer);
		hotelList.add(hotel);
	}
}
