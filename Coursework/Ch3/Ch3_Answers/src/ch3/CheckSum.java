package ch3;

import java.util.Scanner;
import java.text.DecimalFormat;

// you can try 125077790, the last digit should be 9. This book is "Six of Crows" by Leigh Bardugo
// Look it up

public class CheckSum {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // init scanner
		System.out.print("Enter first 9 digits of ISBN: ");
		int first9 = in.nextInt(); // user input
		in.close(); // close scanner
		System.out.println();
		
		int sum = 0; // sum var
		long isbn = first9;
		
		for (int i = 2; i <= 10; i++) {
			sum += i * (first9 % 10); // adding last digit * i
			first9 /= 10; // integer divide will omit last digit
		}
		
		int n = 0; // how much to add to get to a multiple of 11
		
		while (sum % 11 != 0) {
			n++; // add 1
			sum++; // add 1 to sum
		}
		
		//System.out.println(isbn);
		isbn *= 10;
		
		//System.out.println(isbn);
		isbn += n; // to add final number to isbn
		
		//System.out.println(isbn);
		
		DecimalFormat df = new DecimalFormat("0000000000");
		//decimal format for ensuring 10 digits (leading zeros)
		
		System.out.println("10th digit: " + n); // output
		System.out.println("Full ISBN: " + df.format(isbn)); // output
		
	}
	
}