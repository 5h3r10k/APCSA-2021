package pt4_jssCh2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prob10_heronFormula {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".###");
		
		System.out.println("######## HERON'S FORMULA CALCULATOR ########\n");
		
		System.out.print("Enter side 1: ");
		double a = input.nextDouble();
		System.out.println();
		
		System.out.print("Enter side 2: ");
		double b = input.nextDouble();
		System.out.println();
		
		System.out.print("Enter side 3: ");
		double c = input.nextDouble();
		System.out.println();
		System.out.println();
		
		input.close();
		
		double s = 0.5*(a+b+c);
		
		double area = s*(s-a)*(s-b)*(s-c);
		
		area = Math.sqrt(area);
		
		System.out.println("AREA: "+df.format(area));
		
	}

}
