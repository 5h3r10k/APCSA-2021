// ISHAAN VARIAVA
// MR. SOIN - APCSA
// 11-8-2021

/*

	Write a set of code that outputs all of the int values between 1 and 100 
	with 5 values per line, and each of those 5 values spaced out equally. 
	Use a single for-loop to solve this problem.
	
 */

package ch3;

public class WS3_Problem8 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			
			System.out.print(i);
			System.out.print("\t");
			
			if(i%5==0) {
				System.out.println();
			}
			
		}
		
	}
	
}