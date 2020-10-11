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
				System.out.println("Enter Hotel Rate for Regular Customer");
				int hotelRateRegularCustomer=s.nextInt();
				HotelUtility.addHotel(hotelName, hotelRateRegularCustomer);
			}
			
		}while(choice==1);
		
		
		do{
			System.out.println("Enter choice\n"
			         + "1.Get Cheapest Hotel for a range of date\n"
			         + "2.Exit");
	        choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter start date(YEAR-MONTH-DAY)");
				LocalDate startDate=LocalDate.parse(s.next());
				System.out.println("Enter end date(YEAR-MONTH-DAY)");
				LocalDate endDate=LocalDate.parse(s.next());
				HotelUtility.getCheapestHotel(startDate, endDate);
			}
			
		}while(choice==1);	
		
	}
}
