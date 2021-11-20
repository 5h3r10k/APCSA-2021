package pt3_practiceProjs;

import java.text.DecimalFormat;

public class InterestCalc {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(".00"); //decimal formatting class instance creation
		
		// CAN MODIFY //
		int principal = 1000; //starting or principal amount in account
		double interest = 8; //interest IN PERCENT
		int years = 10; //num of years
		
		
		// DO NOT MODIFY //
		interest/=100; //converts interest into a decimal
		double total = principal; //set up a variable for total balance
		
		System.out.println("Starting Amount: $"+principal+"\n" +"Yearly Interest: "+(interest*100)+"%"+"\n");
		
		System.out.println("YEAR"+"\t"+"AMOUNT (EOY)");
		
		for(int i=1;i<=years;i++) {
			total+=(total)*(interest);
			System.out.print(i+"\t");
			System.out.println("$"+df.format(total));
		}
		
		
		
	}

}
