package pt4_jssCh2;

import java.util.Scanner;

public class Prob7_secondsToTime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		input.close();
		System.out.println("\n");
		
		int hrs = seconds/3600;
		
		seconds-=hrs*3600;
		
		int min = seconds/60;
		
		seconds-=min*60;
		
		System.out.println("-------- CONVERSION --------");
		System.out.println(hrs+" HOURS, "+min+" MIN, and "+seconds+" SECONDS");
		
		
	}

}
