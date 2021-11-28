package ch3;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year below: ");
		int year = input.nextInt();
		input.close();
		
		if (year >= 1582) {
			
			if (year % 4 == 0) {
				
				if (year % 100 == 0) {
					
					if (year % 400 == 0) {
						System.out.println("LEAP YEAR!");
					} else {
						System.out.println("NOT A LEAP YEAR!");
					}
					
				} else {
					
					System.out.println("LEAP YEAR!");
					
				}
			} else {
				
				System.out.println("NOT A LEAP YEAR!");
				
			}
			
		} else {
			
			System.out.println("NOT IN THE GREGORIAN CALENDAR!");
			
		}
	}
}