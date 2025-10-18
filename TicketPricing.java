package com.codegnan.controlstatemnts;

public class TicketPricing {
	
	public static void main(String[] args) {
		String passengerType = "adult";
		String bookingTime= "early";
		boolean isMember = true;
		double basePrice= 5000;
		
		if (passengerType.equalsIgnoreCase("child")) {
			basePrice*=0.5;
		} else {
			if (passengerType.equalsIgnoreCase("senior")) {
				basePrice*=0.8;
			} else {
				if (passengerType.equalsIgnoreCase("adult")) {
				} else {
					System.out.println("Invalid passenger type");
					return;
				}
			}
			
		}
		if (bookingTime.equalsIgnoreCase("early")) {
			basePrice*=0.9;
		} else {
			if (bookingTime.equalsIgnoreCase("normal")) {
			} else {
				if (bookingTime.equalsIgnoreCase("last-minute")) {
					basePrice*=1.2;
				} else {
					System.out.println("invalid bookingtime");
					return;
				}
			}
		}
		if (isMember) {
			basePrice*=0.95;	
		}
		System.out.println("Final Ticket Price:"+ basePrice);
	}

}
