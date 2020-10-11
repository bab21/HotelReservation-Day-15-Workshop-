package com.capgemini.hotelreservation;

public class Hotel {
	private String hotelName;
	private int hotelWeekDayRateRegularCustomer;
	private int hotelWeekEndRateRegularCustomer;
	private int rating;
	
	
	public Hotel(String hotelName,int hotelWeekDayRateRegularCustomer,int hotelWeekEndRateRegularCustomer,int rating) {
		this.hotelName=hotelName;
		this.hotelWeekDayRateRegularCustomer=hotelWeekDayRateRegularCustomer;
		this.hotelWeekEndRateRegularCustomer=hotelWeekEndRateRegularCustomer;
		this.rating=rating;
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
	public void setRating(int rating) {
		this.rating=rating;
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
	public int getRating() {
		return this.rating;
	}
}
