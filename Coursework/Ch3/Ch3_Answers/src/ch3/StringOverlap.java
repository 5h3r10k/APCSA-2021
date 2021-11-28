package ch3;

import java.util.Scanner;

public class StringOverlap {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter string 1: ");
		
		String s1 = in.nextLine();
		
		System.out.println("\nEnter string 2: ");
		
		String s2 = in.nextLine();
		
		in.close();
		
		boolean overlap = true;
		
		char current;
		
		for(int i = 0; i<s1.length();i++) {
			
			current = s1.charAt(i);
			
			if(s2.indexOf(current)==-1) {
				overlap = false;
				break;
			}
			
		}
		
		System.out.println("\n" + overlap);

	}

}
