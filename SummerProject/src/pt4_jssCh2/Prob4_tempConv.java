package pt4_jssCh2;

import java.util.Scanner;

public class Prob4_tempConv {

	public static void main(String[] args) {
		
		final int BASE = 32;
		final double RATIO = 5.0/9.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Temperature in °F to convert to °C: ");
		int fTemp = input.nextInt();
		input.close();
		System.out.println();
		
		double cTemp = fTemp - BASE;
		
		cTemp*=RATIO;
		
		System.out.println("Temperature in °C: "+cTemp+"°C");
		
		
	}

}
