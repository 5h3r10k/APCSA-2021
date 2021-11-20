package pt4_jssCh2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prob11_mpgCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".###");
		
		System.out.print("Amount of gas used (gallons): ");
		double gas = input.nextDouble();
		System.out.println("\n");
		
		System.out.print("Odometer reading at start: ");
		int start = input.nextInt();
		System.out.println("\n");
		
		System.out.print("Odometer reading at end: ");
		int end = input.nextInt();
		System.out.println("\n");
		
		input.close();
		
		double mpg = (end-start)/gas;
		
		System.out.println("MPG: "+df.format(mpg));
		
		float m2km = (float)1.60935;
		float g2l = (float)3.78541;
		
		mpg*=m2km/g2l;
		
		System.out.println("Kilometers per liter: "+df.format(mpg));
		
		
	}

}
