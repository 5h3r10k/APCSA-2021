package ch2;

import java.util.Scanner;


public class DateToDay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will return the day of the week a given date falls on.");
		
		System.out.println("\n");
		
		System.out.println("Please enter the month. (January is 1, February is 2, etc): ");
		
		int month = input.nextInt();
		
		System.out.println("\nPlease enter the day: ");
		
		int day = input.nextInt();
		
		System.out.println("\nPlease enter the year: ");
		
		int year = input.nextInt();
		
		input.close();
		
		int yi = year-(14-month)/12;
		
		int x = yi + yi/4 - yi/100 + yi/400;
		
		int mi = month + 12*((14-month)/12)-2;
		
		int di = (day+x+(31*mi)/12)%7;
		
		System.out.println("\nCalculations = "+di);
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.print(month+"/"+day+"/"+year+" falls on a ");
		System.out.println(days[di]);
		
		
		

	}

}