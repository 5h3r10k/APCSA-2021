package ch3;

import java.util.Scanner;

public class StringBackwards {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = input.nextLine();
		input.close();
		
		String reverse = "";
		
		for (int i = text.length() - 1; i >= 0; i--) {
			reverse += text.charAt(i);
		}
		
		System.out.println();
		System.out.println(reverse);
		
	}
	
}