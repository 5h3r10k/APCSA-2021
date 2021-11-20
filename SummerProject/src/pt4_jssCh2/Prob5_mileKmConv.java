package pt4_jssCh2;

import java.util.Scanner;

public class Prob5_mileKmConv {

	public static void main(String[] args) {
		
		float conv = (float)1.60935;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("MILES: ");
		float miles = input.nextFloat();
		input.close();
		System.out.println("\n");
		
		System.out.println("KILOMETERS: "+ (miles*conv));
		
	}

}
