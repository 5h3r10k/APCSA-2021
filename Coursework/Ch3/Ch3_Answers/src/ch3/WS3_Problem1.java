// ISHAAN VARIAVA
// MR. SOIN - APCSA
// 11-8-2021

/*
	Write a “query-controlled” loop that will continue to input int 
	values from the user, adding each to the int value sum, and then 
	ask if the user has another value to input, until the user says 
	that there are no more values. In general, a query is a form of 
	questioning, in a line of inquery.
 */

package ch3;

import java.util.Scanner;

public class WS3_Problem1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum=0, num;
		
		while(true) {
			
			System.out.println("Enter value to add, or '0' to exit. ");
			num = input.nextInt();
			System.out.println();
			
			if(num==0) {
				break;
			}
			
			sum+=num;
			
		}
		
		input.close();
		
		System.out.println("TOTAL SUM: "+ sum);

	}

}