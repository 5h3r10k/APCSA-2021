package ch2;

import java.util.Scanner;
//import packages

public class GreatCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//init scan obj
		
		System.out.println("#### GREAT CIRCLE DISTANCE CALCULATOR ####");
		
		System.out.println();
		
		System.out.println("---- POINT 1 ----\n");
		
		System.out.print("Latitude in degrees: ");
		double x1 = input.nextDouble();
		System.out.println();
		
		System.out.print("Longitude in degrees: ");
		double y1 = input.nextDouble();
		System.out.println();
		
		//get point 1 lat and long
		
		System.out.println();
		//separator
		
		
		System.out.println("---- POINT 2 ----\n");
		
		System.out.print("Latitude in degrees: ");
		double x2 = input.nextDouble();
		System.out.println();
		
		System.out.print("Longitude in degrees: ");
		double y2 = input.nextDouble();
		System.out.println();
		
		//get point 2 lat and long
		
		input.close();
		//close scan obj
		
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		//conv all angles to radians
		
		double distance = (Math.sin(x1)*Math.sin(x2)) + (Math.cos(x1)*Math.cos(x2)) + Math.cos(y1-y2);
		distance = 60 * Math.toDegrees(Math.acos(distance));
		//calculate distance
		
		System.out.println("\n");
		System.out.println("DISTANCE IN NAUTICAL MILES: "+distance);
		
		//output

	}

}
