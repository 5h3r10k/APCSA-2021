// ISHAAN VARIAVA
// MR. SOIN - APCSA
// 11-8-2021

/*

	String s1 is said to overlap String s2 if all of the characters in s1 
	also appear in s2. Write a set of code that will set the boolean 
	variable overlap to true if s1 overlaps s2 and false otherwise. 
	Assume both s1 and s2 have already been input.

 */

package ch3;

import java.util.Scanner;

public class WS3_Problem10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter s1: ");
		String s1 = input.nextLine();
		
		System.out.println("Enter s2: ");
		String s2 = input.nextLine();
		
		input.close();
		
		boolean overlap = true;
		boolean hasChar = false;
		
		for(int i = 0;i<s1.length();i++) {
			
			hasChar = s2.indexOf(s1.charAt(i)) != -1;
			// when trying to find char in s2, 
			// -1 will be returned if its not there
			// so we look if -1 is NOT returned
			
			if(!hasChar) {
				overlap = false;
				break;
			}
			
		}
		
		System.out.println(overlap);
		
	}

}
