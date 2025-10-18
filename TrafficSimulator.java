package com.codegnan.controlstatemnts;

import java.util.Scanner;
public class TrafficSimulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Light state(Green/Yellow/Red)");
		String lightState = scanner.nextLine();
		System.out.println("Enter Hour(0-23)");
		int hour = scanner.nextInt();
		boolean isDaytime = (hour >= 6 && hour <= 18);
		String action;
		if(lightState.equalsIgnoreCase("green")) {
			action = "Go";
		} else {
			if (lightState.equalsIgnoreCase("red")) {
				action = "stop";
		} else {
			if (lightState.equalsIgnoreCase("yellow")) {
				if (isDaytime) {
					action = "slow";
				} else {
					action = "stop";
				}
			} else {
				action = "Invalid Light state";
		
				}
			}
			
		}
		System.out.println(action);
		scanner.close();
		
	}

}
