package ch4;

import java.util.Scanner;

public class RationalOperations {

	public static void main(String[] args) {

		System.out.println("---------------- Rational Operations ----------------\n");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter numerator of first fraction: ");
		int n1 = scn.nextInt();
		System.out.println();
		
		System.out.print("Please enter denominator of first fraction: ");
		int d1 = scn.nextInt();
		System.out.println();
		
		System.out.print("Please enter numerator of second fraction: ");
		int n2 = scn.nextInt();
		System.out.println();
		
		System.out.print("Please enter denominator of second fraction: ");
		int d2 = scn.nextInt();
		System.out.println();
		
		while(true) {
			
			int choice = menu(scn);
			
			if(choice==0) {
				System.out.println("\nQuitting...");
				break;
			}else if(choice ==1) {
				System.out.println();
				addRationals(n1, d1, n2, d2);
			}else if(choice ==2) {
				System.out.println();
				subtractRationals(n1, d1, n2, d2);
			}else if(choice ==3) {
				System.out.println();
				multiplyRationals(n1, d1, n2, d2);
			}else if(choice ==4) {
				System.out.println();
				divideRationals(n1, d1, n2, d2);
			}
			
		}
		
		scn.close();
		
		

	}

	public static int gcf(int n1,int n2) {

		for(int i=n1;i>0;i--) {

			if(n2%i==0 && n1%i==0) {
				return i;
			}

		}

		return -1;

	}


	public static void addRationals(int n1, int d1, int n2, int d2) {

		System.out.print(n1+"/"+d1+" + "+n2+"/"+d2+" = ");

		int num = n1*d2 + n2*d1;
		int denom = d1*d2;

		int lcm = gcf(num,denom);

		num = num/lcm;
		denom = denom/lcm;
		
		if(num==denom) {
			System.out.println("1");
		}else {
			System.out.println(num+"/"+denom);
		}

	}


	public static void subtractRationals(int n1, int d1, int n2, int d2) {

		System.out.print(n1+"/"+d1+" - "+n2+"/"+d2+" = ");

		int num = n1*d2 - n2*d1;
		int denom = d1*d2;

		int lcm = gcf(num,denom);

		num = num/lcm;
		denom = denom/lcm;
		
		if(num==denom) {
			System.out.println("1");
		} else {
			System.out.println(num+"/"+denom);
		}

	}


	public static void multiplyRationals(int n1, int d1, int n2, int d2) {

		System.out.print(n1+"/"+d1+" * "+n2+"/"+d2+" = ");

		int num = n1*n2;
		int denom = d1*d2;

		int lcm = gcf(num,denom);

		num = num/lcm;
		denom = denom/lcm;

		if(num==denom) {
			System.out.println("1");
		} else {
			System.out.println(num+"/"+denom);
		}

	}
	
	public static void divideRationals(int n1, int d1, int n2, int d2) {

		System.out.print(n1+"/"+d1+" / "+n2+"/"+d2+" = ");

		int num = n1*d2;
		int denom = d1*n2;

		int lcm = gcf(num,denom);

		num = num/lcm;
		denom = denom/lcm;
		
		if(num==denom) {
			System.out.println("1");
		}else {
			System.out.println(num+"/"+denom);
		}
		
		

	}
	
	public static int menu(Scanner input) {
		
		System.out.println("\n--------------------------------");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("0. Quit");
		System.out.print("Please enter a choice: ");
		
		int choice = input.nextInt();
		
		while(choice<0 || choice>4) {
			System.out.println("\n--------------------------------");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("0. Quit");
			System.out.print("Please enter a valid choice: ");
			
			choice = input.nextInt();
		}
		
		return choice;
		
		
	}


}
