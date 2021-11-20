package pt3_practiceProjs;

public class NumberReverser {

	public static void main(String[] args) {
		
		// CAN MODIFY //
		
		int num = 1234567890;
		
		
		// DO NOT MODIFY //
		System.out.println("ORIGINAL: " + num);
		String reversed = "";
		
		do {
			reversed+=num%10;
			num/=10;
		} while(num!=0);
		
		System.out.println("REVERSED: "+ reversed);
	}

}
