package com.capgemini.hotelreservation;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class HotelUtility {
	public static List<Hotel> hotelList=new ArrayList<>();
	
	public static void addHotel(String hotelName,int hotelWeekDayRateRegularCustomer,int hotelWeekEndRateRegularCustomer) {
		Hotel hotel=new Hotel(hotelName,hotelWeekDayRateRegularCustomer,hotelWeekEndRateRegularCustomer);
		hotelList.add(hotel);
	}
}
