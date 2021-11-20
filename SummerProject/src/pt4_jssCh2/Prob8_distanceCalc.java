package pt4_jssCh2;

import java.util.Scanner;

public class Prob8_distanceCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ---- POINT 1 ---- \n");
		
		System.out.print("X: ");
		float x1 = input.nextFloat();
		System.out.println();
		
		System.out.print("Y: ");
		float y1 = input.nextFloat();
		System.out.println("\n");
		
		
		System.out.println(" ---- POINT 2 ---- \n");
		
		System.out.print("X: ");
		float x2 = input.nextFloat();
		System.out.println();
		
		System.out.print("Y: ");
		float y2 = input.nextFloat();
		System.out.println("\n");
		
		double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)); //calc distance
		
		System.out.println("DISTANCE: "+dist);
		
		input.close();
		
		
	}

}
