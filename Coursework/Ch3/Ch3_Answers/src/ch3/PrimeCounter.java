package ch3;

import java.util.Scanner;

public class PrimeCounter {

	public static void main(String[] args) {
		
		//USER INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		long N = input.nextLong(); //assigning input to a long var
		System.out.println();
		input.close();
		
		boolean isPrime;
		long primes = 0L;
		long tested = 0;
		
		if(N>2 && N%2==0) {
			N--; //subtract one if N is even
		}
		
		//2 is prime, so we'll add it to the final primecount.
		
		for(long i=N;i>2;i-=2) {
			
			isPrime = true;
			tested++;
			
			for(int j=2;j<i;j++) {
				
				if(i%j==0 && i!=j) {
					isPrime = false;
					break;
				}
				
			}
			
			
			
			if(isPrime) {
				primes++;
				System.out.println(i);
			}
			
		}
		
		primes++; //add one to the count, for 2
		
		System.out.println("Number of primes: "+ primes);
		System.out.println("# of vals tested: "+tested);

	}

}