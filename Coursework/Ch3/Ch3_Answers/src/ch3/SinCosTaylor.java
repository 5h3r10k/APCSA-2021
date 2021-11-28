package ch3;

import java.util.Scanner;

public class SinCosTaylor {

	public static void main(String[] args) {
		
		// USER INPUT
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter angle in degrees: ");
		int deg = input.nextInt();
		System.out.println();
		
		System.out.print("Enter n for the series: ");
		int count = input.nextInt();
		System.out.println();
		
		input.close();
		
		double rad = Math.toRadians(deg);
		
		double sin, cos, numer, denom, fac;
		int power;
		
		sin = rad;
		cos = 1;
		
		
		//cosine
		power = 2;
		for(int i = 2;i<=count;i++) {
			
			numer = Math.pow(rad, power); //calculate numerator
			
			fac = power;
			for(int j=(power-1);j>0;j--) {
				fac*=j;
			} //calculate factorial of the power
			
			denom = fac; //denominator
			
			cos+=Math.pow(-1,i-1)*numer/denom; 
			//adding to cosine, with negation as needed.
			
			power+=2;
			
			
		}
		
		System.out.println("COSINE: " + cos);
		
		
		//sine
		power = 3;
		for(int i = 2;i<=count;i++) {
			
			numer = Math.pow(rad, power); //calculate numerator
			
			fac = power;
			for(int j=(power-1);j>0;j--) {
				fac*=j;
			} //calculate factorial of the power
			
			denom = fac; //denominator
			
			sin+=Math.pow(-1,i-1)*numer/denom; 
			//adding to sine, with negation as needed.
			
			power+=2;
			
			
		}
		
		System.out.println("SINE: " + sin);
		
		
	}

}
