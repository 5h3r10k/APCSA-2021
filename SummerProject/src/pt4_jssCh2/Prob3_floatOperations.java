package pt4_jssCh2;

import java.util.Scanner;

public class Prob3_floatOperations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter float 1: ");
		float float1 = input.nextFloat();
		System.out.println("\n");
		
		System.out.print("Enter float 2: "); 
		float float2 = input.nextFloat();
		System.out.println("\n\n");
		
		input.close();
		
		System.out.println("-------- SUM --------");
		System.out.println(float1 + " + " + float2 + " = " + (float1+float2));
		System.out.println();
		
		System.out.println("-------- DIFFERENCE --------");
		System.out.println(float1 + " - " + float2 + " = " + (float1-float2));
		System.out.println();
		
		System.out.println("-------- PRODUCT --------");
		System.out.println(float1 + " x " + float2 + " = " + (float1*float2));
		System.out.println();
		
		
		
	}

}
