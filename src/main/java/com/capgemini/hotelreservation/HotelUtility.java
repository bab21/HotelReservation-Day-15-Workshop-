package com.capgemini.hotelreservation;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.util.*;

public class HotelUtility {
	public static List<Hotel> hotelList=new ArrayList<>();
	
	public static void addHotel(String hotelName,int hotelWeekDayRateRegularCustomer,int hotelWeekEndRateRegularCustomer) {
		Hotel hotel=new Hotel(hotelName,hotelWeekDayRateRegularCustomer,hotelWeekEndRateRegularCustomer);
		hotelList.add(hotel);
	}
	public static void getCheapestHotel(LocalDate startDate,LocalDate endDate) {
		Hotel cheapestHotel = hotelList.stream()  
                .min((hotel1, hotel2)->   
                computeCost(hotel1,startDate,endDate) > computeCost(hotel2,startDate,endDate) ? 1: -1).get();
		System.out.println("Name of Cheapest Hotel is "+cheapestHotel.getHotelName()+" and cost is "+computeCost(cheapestHotel,startDate,endDate));
	}
	public static int computeCost(Hotel hotel,LocalDate startDate,LocalDate endDate) {
		int hotelCost=0;
		endDate=endDate.plusDays(1);
		while(startDate.compareTo(endDate)!=0) {
					DayOfWeek day = DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK));
				      switch (day) {
				         case SATURDAY:
				            hotelCost=hotelCost+hotel.getHotelWeekEndRateRegularCustomer();
				            break;
				         case SUNDAY:
				        	hotelCost=hotelCost+hotel.getHotelWeekEndRateRegularCustomer();
				            break;
				         default:
				        	 hotelCost=hotelCost+hotel.getHotelWeekDayRateRegularCustomer();
				      }
				    startDate=startDate.plusDays(1);  	      
		}
		return hotelCost;
	}
}
