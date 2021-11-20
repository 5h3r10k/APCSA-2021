package pt3_practiceProjs;

public class BirthdayGifts {

	public static void main(String[] args) {
		
		// CAN MODIFY //
		
		int principal = 10; //starting amount of money, first gift
		int age = 12; //child's age
		int cap = 1000; //gift not to excede this amount
		
		
		//DO NOT MODIFY//
		
		int total = 0;
		int years = 0;
		int gift = principal;
		
		while(gift<=cap) {
			total+=gift;
			years++;
			gift*=2;
		}
		
		System.out.println("Age at last gift: "+(age+years-1)); //there is a subtraction of 1 because 12 years old should not be included
		System.out.println("Total amount received: $"+total);
		
	}

}
