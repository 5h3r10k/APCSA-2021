// ISHAAN VARIAVA
// APCSA - MR. SOIN
// 10-25-2021

package ch3;

import java.util.Scanner;

public class TaxRate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("TAX RATE CALCULATOR\n");
		
		System.out.println("Please enter pay (salary): ");
		int pay = input.nextInt();
		input.close();
		
		int taxRate;
		
		if(pay>100000) {
			taxRate = 40;
		}else if(pay>60000) {
			taxRate = 30;
		}else if(pay>30000) {
			taxRate = 20;
		}else if(pay>15000) {
			taxRate = 10;
		}else if(pay>5000) {
			taxRate = 5;
		}else{
			taxRate = 0;
		}
		
		System.out.println("\nYour tax rate is "+taxRate+"%");
		
	}

}
