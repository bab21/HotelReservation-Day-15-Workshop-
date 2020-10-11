package com.capgemini.hotelreservation;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class HotelUtility {
	public static List<Hotel> hotelList=new ArrayList<>();
	
	public static void addHotel(String hotelName,int hotelRateRegularCustomer) {
		Hotel hotel=new Hotel(hotelName,hotelRateRegularCustomer);
		hotelList.add(hotel);
	}
	public static void getCheapestHotel(LocalDate startDate,LocalDate endDate) {
		Hotel cheapestHotel = hotelList.stream()  
			                .min((hotel1, hotel2)->   
			                hotel1.getHotelRateRegularCustomer() > hotel2.getHotelRateRegularCustomer() ? 1: -1).get();
		
		endDate=endDate.plusDays(1);
		int numDays = Period.between(startDate, endDate).getDays();
		System.out.println("Hotel Name of cheapest hotel: "+cheapestHotel.getHotelName()+" and cost is "+numDays*cheapestHotel.getHotelRateRegularCustomer());
	}
}
