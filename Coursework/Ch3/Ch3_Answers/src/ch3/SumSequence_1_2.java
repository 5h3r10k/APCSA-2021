package ch3;

public class SumSequence_1_2 {

	public static void main(String[] args) {
		
		double sum=0, fac; //sum and factorial initialized
		int n = 5; //n in all the problems
		System.out.println("n = " + n); //stating what n is
		System.out.println("\n");
		
		
		// 1/1! + 2/2! + 3/3! ... n
		for(int i=1;i<=n;i++) {
			
			fac = i; //set fac to i
			
			for(int j=i-1;j>0;j--) {
				fac*=j; 
				//multiply fac by itself-1, until it reaches 0
			}
			
			
			sum+=i/fac; //add to sum var
			
		}
		
		System.out.println("1/1! + 2/2! + 3/3! ... n = " + sum);
		System.out.println(); //display results
		
		
		
		// 1/3! + 5/4! + 9/5! ... n
		double num = 1;
		int denom = 3;
		sum = 0;
		
		for(int i=0;i<n;i++) {
			//repeating n times
			
			//getting factorial of denominator
			fac = denom;
			for(int j=denom-1;j>0;j--) {
				fac*=j; 
				//multiply fac by itself-1, until it reaches 0
			}
			
			sum+=num/fac; //adding to sum
			
			num+=4; //iterating num by 4
			denom++; //iterating denom by 1 
			
			
		}
		
		System.out.println("1/3! + 5/4! + 9/5! ... n = " + sum);
		System.out.println(); //display results
		
		
		
		// 1^2 + 2^2 + 3^2 + ... n^2 = ?
		sum=0;
		
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(i,2); //add square of current i
		}
		
		System.out.println("1^2 + 2^2 + 3^2 + ... n^2 = " + sum);
		System.out.println(); //display results
		
		
		
		// 1/x + 1/x^2 + 1/x^3 ... n = ?
		sum=0;
		int x = 2; //init and declare x
		
		System.out.println("\nx = "+x+"\n\n");
		
		for(int i=1;i<=n;i++) {
			sum+=1/Math.pow(x,i); //raising denom to power of i
		}
		
		System.out.println("1/x + 1/x^2 + 1/x^3 ... n = " + sum);
		System.out.println(); //display results
		
		
		
		// 1 + 3 + 5 + 7 + ... n = ?
		sum = 0;
		
		for(int i=0;i<n;i++) {
			//doing n times
			sum+=(1+2*i); //start with 1, every odd number adds 2
		}
		
		System.out.println("1 + 3 + 5 + 7 + ... n = " + sum);
		System.out.println(); //display results
		
		
		
		// 2 + 4 + 6 + 8 + ... n = ?
		sum = 0;
		
		for(int i=0;i<n;i++) {
			//doing n times
			sum+=(2+2*i); //start with 2, every number adds 2
		}
		
		System.out.println("2 + 4 + 6 + 8 + ... n = " + sum);
		System.out.println(); //display results
		
		
		
		// x + x^1 + x^2 + x^3 + ... x^N = ?
		sum = x;
		
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(x,i); //raising to i power, adding to sum
		}
		
		System.out.println("x + x^1 + x^2 + x^3 + ... x^N = " + sum);
		System.out.println(); //display results
		
		
	}

}
