// ISHAAN VARIAVA
// MR. SOIN - APCSA
// 11-8-2021

/*

	Write code that inputs a set of int values and computes its average. 
	Ask the user first how many int values will be input. Make sure 
	that your code cannot produce a division by zero error.

 */

package ch3;

import java.util.Scanner;

public class WS3_Problem4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of values to average: ");
		
		int vals = input.nextInt();
		
		if(vals<=0) {
			
			input.close();
			System.out.println("Invalid input, please try again.");
			
		}else {
			
			int sum = 0;
			
			for(int i=1;i<=vals;i++) {
				
				System.out.print("Enter value #"+i+": ");
				sum+= input.nextInt();
				System.out.println();
				
				
			}
			
			input.close();
			
			System.out.println("AVERAGE: "+ (double)sum/vals);
			
		}

	}

}