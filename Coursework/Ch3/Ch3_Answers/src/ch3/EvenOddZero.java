// ISHAAN VARIAVA
// APCSA - MR. SOIN
// 10-25-2021

package ch3;

import java.util.Scanner;

public class EvenOddZero {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		input.close();
		
		if(num==0) {
			System.out.println("\nZERO");
		}else if(num%2==0) {
			System.out.println("\nEVEN");
		}else {
			System.out.println("\nODD");
		}
		
		
	}

}
