// ISHAAN VARIAVA
// APCSA - MR. SOIN
// 10-25-2021

package ch3;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1,num2,num3,max = 0;
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter third number: ");
		num3 = input.nextInt();
		System.out.println();
		
		input.close();
		
		if(num2>num1) {
			max = num2;
		}
		
		if(num3 > num2) {
			max = num3;
		}
		
		if(num1 > num3) {
			max = num1;
		}
		
		System.out.println("\nMAX VALUE: "+max);
		
	}

}