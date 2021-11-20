package pt4_jssCh2;

import java.util.Scanner;

public class Prob6_secondsCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("HOURS: ");
		int hours = input.nextInt();
		System.out.println("\n");
		
		System.out.print("MINUTES: ");
		int min = input.nextInt();
		System.out.println("\n");
		
		System.out.print("SECONDS: ");
		int sec = input.nextInt();
		System.out.println("\n");
		
		input.close();
		
		System.out.println(hours+" HOURS, "+min+" MINUTES, & "+sec+" SECONDS is equivalent to "+((hours*3600)+(min*60)+sec)+" SECONDS.");
		
	}

}
