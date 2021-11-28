package ch3;

import java.util.Scanner;

public class NestedLoops_PatternB {

	public static void main(String[] args) {
		
		//Receiving INPUT
		Scanner in = new Scanner(System.in);
		System.out.print("Enter input: ");
		int n = in.nextInt();
		in.close();
		System.out.println();
		
		for(int i=0;i<n;i++) {
			//This is for each line
			
			for(int j=0;j<=i;j++) {
				//This is how many times per line
				System.out.print("*");
			}
			
			System.out.println();
			//move to next line
			
		}

	}

}
