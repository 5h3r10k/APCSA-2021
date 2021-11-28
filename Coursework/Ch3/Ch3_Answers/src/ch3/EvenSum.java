package ch3;

import java.util.Scanner;

public class EvenSum {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // init scanner
		System.out.println("Please enter value: "); // prompt
		int val = input.nextInt(); // input value
		input.close(); // close scanner
		
		if (val >= 2) {
			
			int sum = 0;
			
			for (int i = 2; i <= val; i += 2) {
				sum += i;
			}
			
			System.out.println("SUM = " + sum);
			
		} else {
			
			System.out.println("Error. Value must be greater than 2");
			
		}
		
	}
	
}