package ch3;

import java.util.Scanner;

public class SumSequence_1_3 {

	public static void main(String[] args) {
		
		//def variables
		int change = 32;
		int sum = 12;
		boolean add = false; //subtract first
		
		//user input
		Scanner in = new Scanner(System.in);
		System.out.println("Number of steps: ");
		int steps = in.nextInt();
		in.close();
		
		System.out.print("\n" + sum);
		
		for(int i=1;i<steps;i++) {
			
			if(add) {
				sum+=change; //if adding, add
				System.out.print(" + ");
				add=false; //then change to subtract next
			}else {
				sum-=change; //if subtracting, subtract
				System.out.print(" - ");
				add=true; //then change to add next
			}
			
			System.out.print(change);
			
			change+=20; //the change increases by 20
			
		}
		
		System.out.println("\n= "+sum); //print out
		
	}

}
