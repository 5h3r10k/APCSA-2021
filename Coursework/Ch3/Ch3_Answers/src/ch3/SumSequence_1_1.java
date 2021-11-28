//SUM OF SEQUENCES USING CONTROL STRUCUTURES Worksheet 1, Problem 1

package ch3;

public class SumSequence_1_1 {

	public static void main(String[] args) {
		
		// 1 + 1/3 + 1/5 + ... + 1/99 = ?
		
		double sum = 1; //sum variable
		
		for(int i=3;i<=99;i+=2) {
			sum+=1/(double)i; //adding to the sum variable
		} //each iteration adds 2 to i, moving to the next odd num
		
		System.out.println("1 + 1/3 + 1/5 + ... + 1/99 = " + sum);
		System.out.println();
		
		
		// 1 + 1/2 + 1/4 + ... + 1/100 = ?
		
		sum = 1; //reset sum to 1
		
		for(int i=2;i<=100;i+=2) {
			sum+=1/(double)i; //adding to sum var
		} //starts at 2, increases by 2 each time till 100 (inclusive)
		
		System.out.println("1 + 1/2 + 1/4 + ... + 1/100 = " + sum);
		System.out.println();
		
		
		// 1 + 1/4 + 1/8 + ... + 1/100 = ?
		
		sum = 1; //reset sum to 1
		
		for(int i=4;i<=100;i+=4) {
			sum+=1/(double)i; //adding to sum var
		} //starts at 2, increases by 4 each time till 100 (inclusive)
		
		System.out.println("1 + 1/4 + 1/8 + ... + 1/100 = " + sum);
		System.out.println();
		
		
		
		// 1/2 + 2/3 + 3/4 + ... + 99/100 = ?
		
		sum = 0; //reset sum to 0
		
		for(int i=1;i<=99;i++) {
			
			sum+=(double)i/(i+1);
			//denominator is 1 more than numerator
			
		}
		
		System.out.println("1/2 + 2/3 + 3/4 + ... + 99/100 = " + sum);
		System.out.println();
		

	}

}
