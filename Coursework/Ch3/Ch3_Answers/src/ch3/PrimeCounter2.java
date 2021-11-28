package ch3;

import java.util.Scanner;

public class PrimeCounter2 {

	public static void main(String[] args) {
		
		//USER INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N: ");
		long N = input.nextLong(); //assigning input to a long var
		System.out.println();
		input.close();
		
		long max = N;
		long tested = 0;
		boolean isPrime = true;
		long primes = 0L;
		long testing; //number currently being tested
		
		while(max%6!=0) {
			max++; //move N to the next multiple of 6
		}
		
		//2 is prime, so we'll add it to the final primecount.
		
		for(long i=max;i>5;i-=6) {
			
			for(int x = 1;x>=-1;x-=2) {
				
				isPrime = true;
				testing=i+x; //test number being tested
				tested++;
				
				for(long j=2;j<testing;j++) {
					
					if(testing%j==0) {
						isPrime = false;
						break;
					}
					
				}
				
				if(isPrime && testing<N) {
					System.out.println(testing);
					primes++;
					//System.out.println(" --> " + isPrime + "\t"+primes);
				}
				
				
			}

		}
		
		
		if(N>3) {
			primes+=2; //add one to the count, for 2
		}else if(N>2) {
			primes++;
		}
		
		
		System.out.println("Number of primes: "+ primes);
		System.out.println("# of vals tested: "+tested);


	}

}
