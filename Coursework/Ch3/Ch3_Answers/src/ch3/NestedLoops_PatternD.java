package ch3;

import java.util.Scanner;

public class NestedLoops_PatternD {

	public static void main(String[] args) {

		//Receiving INPUT
		Scanner in = new Scanner(System.in);
		System.out.print("Enter input: ");
		int n = in.nextInt();
		in.close();
		System.out.println();
		
		for(int i=n;i>0;i--) {
			//This is for each line
			
			for(int j=0;j<n-i;j++) {
				//This is how many spaces per line
				System.out.print(" ");
			}
			
			for(int k=0;k<i;k++) {
				//This is how many times per line
				System.out.print("*");
			}
			
			System.out.println();
			//move to next line
			
		}

	}

}
