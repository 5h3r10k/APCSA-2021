// Ishaan Variava
// 10/11/2021
// APCSA - Mr. Soin

package ch2;

//import appropriate classes
import java.util.Random;
import java.util.Scanner;

public class RandomAB {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		//create instance of random object
		
		Scanner input = new Scanner(System.in);
		// create scanner instance
		
		System.out.println("#### RANDOM NUMBER IN RANGE ####");
		System.out.println("This program will print a random number" + " between a and b inclusive\n");
		//program intro instructions
		
		// getting input A
		System.out.println("Please enter an integer value for A: ");
		int a = input.nextInt();
		
		// getting input B
		System.out.println("Please enter an integer value for B: ");
		int b = input.nextInt();
		
		//closing scanner instance
		input.close();
		
		//calculating random number
		int randNum = rand.nextInt(b - a + 1) + a;
		
		// displaying random number as output
		System.out.println("\nYOUR RANDOM NUMBER in the range " + "[" + a + "," + b + "]: " + randNum);
		
	}
	
}