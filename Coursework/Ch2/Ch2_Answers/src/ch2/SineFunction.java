// Ishaan Variava
// 10/11/2021 - APCSA
// Mr. Soin
package ch2;

import java.util.Scanner;

// imported scanner for receiving user input
public class SineFunction {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// init scanner object instance
		
		System.out.println("#### Calculuating sin(2t) + sin(3t) ####");
		System.out.println("\nPlease enter a value t in degrees: ");
		//intro and ask for value
		
		double t = input.nextDouble();
		// accept value as double
		
		input.close();
		//close input
		
		double sinVal = Math.sin(2 * Math.toRadians(t)) + Math.sin(3 * Math.toRadians(t));
		// calculate sin(2t) + sin(3t)
		
		System.out.println("Calculation: " + sinVal);
		// output calculation
	
	}
	
}