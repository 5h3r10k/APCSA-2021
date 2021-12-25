package ch4;

import java.util.Scanner;

public class Quadratic {

	static double a,b,c;

	public static void main(String[] args) {

		//INTRO
		System.out.println("---------------- QUADRATIC ROOT CALCULATOR ----------------");
		System.out.println("using quadratic form \'ax^2 + bx + c\'"+"\n");

		//USER INPUT
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.println();

		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.println();

		System.out.print("Enter c: ");
		c = input.nextDouble();
		System.out.println();

		input.close();

		//OUTPUT

		if(isRealRoots()) {
			System.out.println("Roots: ");
			System.out.println("\t"+"> "+plusRoot());
			System.out.println("\t"+"> "+minusRoot());
		}else {
			System.out.println("No real roots");
		}

	}

	public static double discriminant() {

		return Math.pow(b,2) - 4*a*c;

	}

	public static boolean isRealRoots() {

		return discriminant()>=0;

	}

	public static double plusRoot() {

		return (-b+Math.sqrt(discriminant()))/(2*a);

	}

	public static double minusRoot() {

		return (-b-Math.sqrt(discriminant()))/(2*a);

	}


}
