package com.codegnan.controlstatemnts;

import java.util.Scanner;
public class AmountWithDraw {

	public static void main(String[] args) {
		double balance=10000;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter withdraw Amount:");
	double withdrawAmount = scanner.nextDouble();
	if(withdrawAmount<= balance) {
		balance -=withdrawAmount;
		System.out.println("Withdrawl Succesfull . Remaining balance is " + balance);
	} else {
		System.out.println("Insufficient Funds");
	}
	

	}

}
