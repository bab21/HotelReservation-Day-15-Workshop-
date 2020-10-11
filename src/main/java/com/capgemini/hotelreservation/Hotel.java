package com.capgemini.hotelreservation;

public class Hotel {
	private String hotelName;
	private int hotelWeekDayRateRegularCustomer;
	private int hotelWeekEndRateRegularCustomer;
	
	
	public Hotel(String hotelName,int hotelWeekDayRateRegularCustomer,int hotelWeekEndRateRegularCustomer) {
		this.hotelName=hotelName;
		this.hotelWeekDayRateRegularCustomer=hotelWeekDayRateRegularCustomer;
		this.hotelWeekEndRateRegularCustomer=hotelWeekEndRateRegularCustomer;
	}
	public void setHotelName(String hotelName) {
		this.hotelName=hotelName;
	}
	public void setHotelWeekDayRateRegularCustomer(int hotelWeekDayRateRegularCustomer) {
		this.hotelWeekDayRateRegularCustomer=hotelWeekDayRateRegularCustomer;
	}
	public void setHotelWeekEndRateRegularCustomer(int hotelWeekEndRateRegularCustomer) {
		this.hotelWeekEndRateRegularCustomer=hotelWeekEndRateRegularCustomer;
	}
	public String getHotelName() {
		return this.hotelName;
	}
	public int getHotelWeekDayRateRegularCustomer() {
		return this.hotelWeekDayRateRegularCustomer;
	}
	public int getHotelWeekEndRateRegularCustomer() {
		return this.hotelWeekEndRateRegularCustomer;
	}
}
