package ch4;

import java.util.Scanner;

public class PalindromeTester {
	
	public static void main(String[] args) {
		// USER INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string to test for palindrome: ");
		String word = input.nextLine();
		input.close();
		System.out.println();
		
		System.out.println(isPalindrome(word));
		
		// test Hel1l10o0o1l1l3E3H, this should be true
	}

	public static String removePunctuation(String in) {
		
		String out = "";
		in = in.toLowerCase();
		
		for (int i = 0; i < in.length(); i++) {
			
			if (in.charAt(i) >= 'a' && in.charAt(i) <= 'z') {
				
				out += in.charAt(i);
				
			}
			
		}
		
		return out;
		
	}

	public static String reverse(String in) {
		
		String out = "";
		
		for (int i = in.length() - 1; i >= 0; i--) {
			
			out += in.charAt(i);
			
		}
		
		return out;
		
	}

	public static boolean isPalindrome(String in) {
		
		return removePunctuation(in).equals(reverse(removePunctuation(in)));
		
	}
	
}
