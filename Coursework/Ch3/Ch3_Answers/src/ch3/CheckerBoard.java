package ch3;

import java.util.Scanner;

public class CheckerBoard {

	public static void main(String[] args) {

		// USER INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("---------------- CHECKERBOARD GENERATOR ----------------");
		System.out.print("Please enter n (number of rows/columns): ");
		int n = input.nextInt();
		System.out.println();
		input.close();
		
		// characters that will be used
		String spaces = "_*";
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print(spaces.charAt(Math.abs((j-i)%2)));
				// a bit of complex logic
				// Math.abs((j-i)%2) will help alternate 0s and 1s
				// these 0s and 1s are indices for the spaces string
			}
			
			System.out.println();
			
		}

	}

}
