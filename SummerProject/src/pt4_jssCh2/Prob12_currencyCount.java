package pt4_jssCh2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Prob12_currencyCount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("$$$$$$$$ CURRENCY COUNTER $$$$$$$$\n");
		
		System.out.print("Quarters: ");
		int q = input.nextInt();
		System.out.println();
		
		System.out.print("Dimes: ");
		int d = input.nextInt();
		System.out.println();
		
		System.out.print("Nickels: ");
		int n = input.nextInt();
		System.out.println();
		
		System.out.print("Pennies: ");
		int p = input.nextInt();
		System.out.println("\n");
		
		input.close();
		
		double total = (q*0.25)+(d*0.10)+(n*0.05)+(p*0.01);
		
		System.out.println("TOTAL: "+money.format(total));
		
	}

}
