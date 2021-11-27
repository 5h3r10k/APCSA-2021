// ISHAAN VARIAVA - 10/11/2021
// AP CSA
// MR. SOIN

package ch2;

import java.util.Scanner;

public class ThreeSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//init scanner object
		
		System.out.println("## THREESORT ##");
		System.out.println("This program will accept 3 integer inputs and"
				+ " return them in ascending order.");
		//intro and instructions
		
		System.out.println();
		//line break
		
		System.out.println("Please enter integer #1: ");
		int num1 = input.nextInt();
		//fetch first int from user
		
		System.out.println("Please enter integer #2: ");
		int num2 = input.nextInt();
		//fetch second int from user
		
		System.out.println("Please enter integer #3: ");
		int num3 = input.nextInt();
		//fetch third int from user
		
		input.close();
		//close input obj
		
		int min = Math.min(Math.min(num1,num2),num3); //find max
		int max = Math.max(Math.max(num1,num2),num3); //find min
		
		int mid; //init mid variable
		
		if(min<num1 && num1<max) {
			mid = num1;
		}else if(min<num2 && num2<max){
			mid = num2;
		}else{
			mid = num3;
		}
		//finding middle number
		
		System.out.println("\n#### SORTED ####");
		System.out.println(min+", "+mid+", "+max);
		//printing out final sorted list
		
	}

}
