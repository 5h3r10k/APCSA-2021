package pt4_jssCh2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Prob2_intAvg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //init scanner object
		DecimalFormat df = new DecimalFormat(".##"); //init decimalformat object
		
		System.out.println("-------- AVERAGE CALCULATOR --------");
		System.out.println();
		
		//get first int
		System.out.print("Enter integer #1: ");
		
		int first = input.nextInt();
		System.out.println("\n");
		
		//get second int
		System.out.print("Enter integer #2: ");
		
		int second = input.nextInt();
		System.out.println("\n");
		
		//get third int
		System.out.print("Enter integer #3: ");
		
		int third = input.nextInt();
		System.out.println("\n");
		
		//print out average, with cast to double
		System.out.println("The average of "+first+", "+second+", and "+third + " is "+ df.format((double)(first+second+third)/3));
		
		input.close();
		
		
	}

}
