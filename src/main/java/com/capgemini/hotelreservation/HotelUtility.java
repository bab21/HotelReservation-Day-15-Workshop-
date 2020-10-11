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
	public static void getCheapestBestRatedHotel(LocalDate startDate,LocalDate endDate,String customerType) {
		Hotel cheapestHotel = hotelList.stream()  
			                .min((hotel1, hotel2)->   
			                computeCost(hotel1,startDate,endDate,customerType) > computeCost(hotel2,startDate,endDate,customerType) ? 1: -1).get();
		
		Hotel cheapestBestRatedHotel =hotelList.stream()  
			                .filter(hotel -> computeCost(hotel,startDate,endDate,customerType)==computeCost(cheapestHotel,startDate,endDate,customerType))
			                .max((hotel1,hotel2)->hotel1.getRating()>hotel2.getRating()?1:-1)        
			                .get(); 
		System.out.println("Cheapest best Rated hotel is "+cheapestBestRatedHotel.getHotelName()+" and cost is "+computeCost(cheapestBestRatedHotel,startDate,endDate,customerType));	
	}
	
	public static int computeCost(Hotel hotel,LocalDate startDate,LocalDate endDate,String customerType) {
		int hotelCost=0,weekDayRate=0,weekEndRate=0;
		endDate=endDate.plusDays(1);
		if(customerType.equals("regular"))
		{	weekDayRate=hotel.getHotelWeekDayRateRegularCustomer();
			weekEndRate=hotel.getHotelWeekEndRateRegularCustomer();
		}
		else {
			weekDayRate=hotel.getHotelWeekDayRateRewardCustomer();
			weekEndRate=hotel.getHotelWeekEndRateRewardCustomer();
		}
		
		while(startDate.compareTo(endDate)!=0) {
					DayOfWeek day = DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK));
				      switch (day) {
				         case SATURDAY:
				            hotelCost=hotelCost+weekEndRate;
				            break;
				         case SUNDAY:
				        	hotelCost=hotelCost+weekEndRate;
				            break;
				         default:
				        	 hotelCost=hotelCost+weekDayRate;
				      }
				    startDate=startDate.plusDays(1);  	      
		}
		return hotelCost;
	}
}
