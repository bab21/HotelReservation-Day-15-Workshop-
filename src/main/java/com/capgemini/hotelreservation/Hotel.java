package com.capgemini.hotelreservation;

public class Hotel {
	private String hotelName;
	private int hotelRateRegularCustomer;
	
	public Hotel(String hotelName,int hotelRateRegularCustomer) {
		this.hotelName=hotelName;
		this.hotelRateRegularCustomer=hotelRateRegularCustomer;
	}
	public void setHotelName(String hotelName) {
		this.hotelName=hotelName;
	}
	public void setHotelRateRegularCustomer(int hotelRateRegularCustomer) {
		this.hotelRateRegularCustomer=hotelRateRegularCustomer;
	}
	public String getHotelName() {
		return this.hotelName;
	}
	public int getHotelRateRegularCustomer() {
		return this.hotelRateRegularCustomer;
	}
}
