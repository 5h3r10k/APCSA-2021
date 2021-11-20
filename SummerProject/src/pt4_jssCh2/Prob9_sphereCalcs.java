package pt4_jssCh2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prob9_sphereCalcs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".####");
		
		System.out.print("Enter radius of sphere: ");
		double radius = input.nextDouble();
		System.out.println("\n");
		
		input.close();
		
		double pi = Math.PI;
		
		double surf = 4 * pi * radius * radius;
		
		double vol = (double)4/3 * pi * Math.pow(radius,3);
		
		System.out.println("VOLUME: "+ df.format(vol));
		System.out.println("SURFACE AREA: "+ df.format(surf));
		

	}

}
