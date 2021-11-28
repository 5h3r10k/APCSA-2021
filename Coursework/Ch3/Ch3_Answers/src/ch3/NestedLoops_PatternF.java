package ch3;

import java.util.Scanner;

public class NestedLoops_PatternF {

	public static void main(String[] args) {

		//Receiving INPUT
		Scanner in = new Scanner(System.in);
		System.out.print("Enter input: ");
		int n = in.nextInt();
		in.close();
		System.out.println();
		
		//Variables
		int spaces,stars = 1;
		
		//moving n to the next odd number
		while(n%2==0) {
			n++;
		}	
		
		for(int line = 1;line<=n;line++) {
			
			spaces = n - stars;
			spaces/=2; //num of spaces on each side
			
			//print spaces on left of stars
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			
			//print stars
			for(int z=0;z<stars;z++) {
				System.out.print("*");
			}
			
			//print spaces on right of stars
			for(int k=0;k<spaces;k++) {
				System.out.print(" ");
			}
			
			//increase stars by 2 if less than halfway
			//otherwise decrease stars by 2
			if(line<(n+1)/2) {
				stars+=2;
			}else {
				stars-=2;
			}
			
			//next line
			System.out.println();
			
		}

	}

}
