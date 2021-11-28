package ch3;

import java.util.Scanner;

//THIS Palindrome tester will eliminate any spaces or punctuation.

/*
 * For example, "he31l1lo_1o1ll^3eH" is a palindrome because all non-letters are eliminated.
 */

public class PalindromeTester {
	
	public static void main(String[] args) {
		
		//INTRODUCTION
		System.out.println(">>>>>>>> PALINDROME TESTER <<<<<<<<");
		System.out.println();
		System.out.println("Please enter a string: ");
		
		
		//USER INPUT
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		input.close();
		
		
		//To lower case
		original = original.toLowerCase();
		
		System.out.println("Lowercase: " + original);
		
		
		//remove all non-punctuation
		String nonPunc = "";
		
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) <= 'z' && original.charAt(i) >= 'a') {
				nonPunc += original.charAt(i);
			}
		}
		
		System.out.println("Without punctuation: " + nonPunc);
		
		
		//reverse string
		String reversed = "";
		for (int i = nonPunc.length() - 1; i >= 0; i--) {
			reversed += nonPunc.charAt(i);
		}
		
		System.out.println("Reversed: " + reversed);
		
		
		//OUTPUT
		System.out.println();
		System.out.println("Palindrome? " + reversed.equals(nonPunc));
	}
}