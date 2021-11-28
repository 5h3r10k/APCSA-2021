// ISHAAN VARIAVA
// APCSA - MR. SOIN
// 10-21-2021

package ch3;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		String line = "----------------";
		
		System.out.println("WELCOME TO ROCK PAPER SCISSORS");
		System.out.println("Enter \'quit\' anytime to exit and see score.");
		System.out.println();
		
		int userScore = 0, compScore = 0, ties = 0;
		int round = 0;
		
		String userChoice, compChoice = "";
		String[] choices = {"ROCK","PAPER","SCISSORS"};
		
		while(true) {
			
			round++;
			System.out.println(line+"\n");
			System.out.println("ROUND "+round+"\n");
			//increase round number and print separator/heading
			
			//SHOW SCORE
			System.out.println("SCORE (WINS-LOSSES-TIES): "
			+userScore+" - "+compScore+" - "+ties);
			System.out.println();
			
			//COMPUTER CHOICE 
			//we are using the 'choices' string array here
			compChoice = choices[rand.nextInt(3)];
			System.out.println("The computer has made its choice.\n");
			
			
			//GETTING USER CHOICE
			System.out.println("Enter your choice. "
					+ "\"ROCK\", \"PAPER\", or \"SCISSORS\"?");
			
			userChoice = input.next();
			
			while ( !userChoice.equals("ROCK") && 
					!userChoice.equals("PAPER") && 
					!userChoice.equals("SCISSORS") && 
					!userChoice.equals("quit")) {
				
				System.out.println("Invalid choice. "
						+ "\"ROCK\", \"PAPER\", or \"SCISSORS\"?");
				userChoice = input.next();
				
			}
			
			if(userChoice.equals("quit")) {
				System.out.println(line+"\n");
				System.out.println("THANKS FOR PLAYING!");
				System.out.println("FINAL SCORE (WINS-LOSSES-TIES): "
				+userScore+" - "+compScore+" - "+ties);
				input.close();
				break;
			}
			
			
			//SHOWING CHOICES
			System.out.println();
			System.out.println("You chose: "+userChoice+"\n"
			+"Computer chose: "+ compChoice+"\n");
			
			
			//DECIDING WHO WON
			if(compChoice.equals(userChoice)) {
				
				ties++;
				System.out.println("TIE!");
				
			}else {
				
				if(compChoice.equals("ROCK")) {
					
					if(userChoice.equals("PAPER")) {
						userScore++;
						System.out.println("YOU WIN!");
					}else {
						compScore++;
						System.out.println("COMPUTER WINS!");
					}
					
				}
				
				if(compChoice.equals("PAPER")) {
					
					if(userChoice.equals("SCISSORS")) {
						userScore++;
						System.out.println("YOU WIN!");
					}else {
						compScore++;
						System.out.println("COMPUTER WINS!");
					}
					
				}
				
				if(compChoice.equals("SCISSORS")) {
					
					if(userChoice.equals("ROCK")) {
						userScore++;
						System.out.println("YOU WIN!");
					}else {
						compScore++;
						System.out.println("COMPUTER WINS!");
					}
					
				}
			
			}
			
			
		}

	}

}
