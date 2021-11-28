package ch3;

import java.util.Scanner;

public class ClassifyDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		
		int num = in.nextInt();
		
		in.close();
		
		System.out.println();
		
		String numStr = String.valueOf(num);
		
		int digit, zero, even, odd;
		zero = even = odd = 0;
		
		for(int i=0;i<numStr.length();i++) {
			
			digit = Integer.parseInt(numStr.substring(i,i+1));
			
			if(digit==0) {
				zero++;
			}else if (digit%2==0) {
				even++;
			}else {
				odd++;
			}
			
		}
		
		System.out.println();
		
		System.out.println("ZERO: "+zero);
		System.out.println("EVEN: "+even);
		System.out.println("ODD: "+odd);
		

	}

}
