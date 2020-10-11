package com.capgemini.hotelreservation;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.util.*;

public class HotelUtility {
	public static List<Hotel> hotelList=new ArrayList<>();
	
	public static void addHotel(String hotelName,int hotelWeekDayRateRegularCustomer,int hotelWeekEndRateRegularCustomer,int rating,int hotelWeekDayRateRewardCustomer,int hotelWeekEndRateRewardCustomer) {
		Hotel hotel=new Hotel(hotelName,hotelWeekDayRateRegularCustomer,hotelWeekEndRateRegularCustomer,rating,hotelWeekDayRateRewardCustomer,hotelWeekEndRateRewardCustomer);
		hotelList.add(hotel);
	}
}
