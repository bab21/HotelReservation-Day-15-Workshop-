package com.capgemini.hotelreservation;
import java.time.LocalDate;
import java.util.*;

public class HotelReservation {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		Scanner s=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Enter choice\n"
					         + "1.Add Hotel\n"
					         + "2.Stop adding hotels");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Hotel Name");
				String hotelName=s.next();
				System.out.println("Enter Hotel WeekDay Rate for Regular Customer");
				int hotelWeekDayRateRegularCustomer=s.nextInt();
				System.out.println("Enter Hotel WeekEnd Rate for Regular Customer");
				int hotelWeekEndRateRegularCustomer=s.nextInt();
				System.out.println("Enter rating for the hotel(1-5)");
				int rating=s.nextInt();
				HotelUtility.addHotel(hotelName,hotelWeekDayRateRegularCustomer, hotelWeekEndRateRegularCustomer,rating);
			}
			
		}while(choice==1);
		
		do{
			System.out.println("Enter choice\n"
			         + "1.Get Cheapest Best Rated Hotel for a range of date\n"
			         + "2.Exit");
	        choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter start date(YEAR-MONTH-DAY)");
				LocalDate startDate=LocalDate.parse(s.next());
				System.out.println("Enter end date(YEAR-MONTH-DAY)");
				LocalDate endDate=LocalDate.parse(s.next());
				HotelUtility.getCheapestBestRatedHotel(startDate, endDate);
			}
			
		}while(choice==1);	
	}
}
