// ISHAAN VARIAVA
// APCSA - MR. SOIN
// 10/12/2021

package ch2;

import java.util.Scanner;
import java.text.NumberFormat;
//import classes

public class LoanPayment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//init scanner obj
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println("#### LOAN PAYMENT CALCULATOR ###\n");
		
		System.out.println("This calculator will return the necessary monthly payment "
				+ "\ngiven the Principal value, rate of continuous compounding, "
				+ "\nand duration of loan in years.");
		
		System.out.println();
		//introductory text
		
		
		System.out.print("Principal value \'P\': ");
		double P = input.nextDouble();
		System.out.println("\n");
		//get P from user
		
		System.out.print("Annual interest rate value \'r\': ");
		double r = input.nextDouble();
		System.out.println("\n");
		//get r from user
		
		System.out.print("Years to pay back loan \'t\': ");
		int t = input.nextInt();
		System.out.println("\n");
		//get t from user
		
		
		input.close();
		//close scanner obj
		
		
		double payment = P*Math.exp(r*t);
		//calc payment
		
		int months = t*12;
		//conv t from years to months
		
		String monthly = nf.format(payment/months);
		//get currency formatted monthly payment
		
		System.out.println("CALCULATED MONTHLY PAYMENT: "+monthly);
		//output to user
		
		

	}

}
