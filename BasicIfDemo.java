package com.codegnan.controlstatemnts;

import java.util.Scanner;
public class BasicIfDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		if (number > 0) {
		System.out.println("The Number" + number +"is positive");
	} else {
		System.out.println("The Number" + number + "is negative");
	}
		System.out.println("This statement always execute");
	}
}

		
		

	


