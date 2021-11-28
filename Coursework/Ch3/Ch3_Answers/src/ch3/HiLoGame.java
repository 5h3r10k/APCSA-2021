package ch3;

import java.util.Random;
import java.util.Scanner;

public class HiLoGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int num, guess, guesses, againChoice;
		
		while(true) {
			
			num = rand.nextInt(100)+1;
			
			System.out.println("Random number generated. \n");
			//System.out.println(num+"\n");
			
			guesses = 1;
			
			while(true) {
			
				System.out.println("\nPlease enter your guess: ");
				guess = input.nextInt();
				
				if(guess == -1) {
					System.out.println("\nQUITTING current game...");
					break;
				}
				
				if(guess == num) {
					System.out.println("\nCorrect! # of guesses = "+ guesses);
					break;
				}
				
				if(guess < num) {
					System.out.println("\nLOW, try again.");
				}
				
				if(guess > num) {
					System.out.println("\nHIGH, try again.");
				}
				
				guesses++;
			
			}
			
			System.out.println("\nWant to play another game? (Enter 1 for yes, 0 for no): ");
			againChoice = input.nextInt();
			
			if(againChoice==0) {
				System.out.println("\nThank you, goodbye!");
				break;
			}
			
			
		}
		
		input.close();

	}

}