package ch2;

public class UniformRandom {
	
	public static void main(String[] args) {
		
		System.out.println("---- 5 RANDOM NUMBERS ----\n"); // prints a generic heading
		
		int times = 5; // how many random numbers
		double avgSum = 0;
		
		/*
		 * for(int i=0;i<times;i++){ double randNum = Math.random(); avgSum+=randNum;
		 * System.out.println((i+1)+") "+randNum); }
		 */
		
		double rand1 = Math.random();
		double rand2 = Math.random();
		double rand3 = Math.random();
		double rand4 = Math.random();
		double rand5 = Math.random();
		
		avgSum += rand1;
		avgSum += rand2;
		avgSum += rand3;
		avgSum += rand4;
		avgSum += rand5;
		
		System.out.println("1) " + rand1);
		System.out.println("2) " + rand2);
		System.out.println("3) " + rand3);
		System.out.println("4) " + rand4);
		System.out.println("5) " + rand5);
		
		System.out.println();
		System.out.println("---- STATS ----\n");
		
		
		double average = avgSum / times; // finding average
		
		System.out.println("AVERAGE: " + average); 
		
		
		//finding minimum
		double min = Math.min(rand1, rand2);
		min = Math.min(min, rand3);
		min = Math.min(min, rand4);
		min = Math.min(min, rand5);
		
		System.out.println("MINIMUM: " + min);
		
		
		//finding maximum
		double max = Math.max(rand1, rand2);
		max = Math.max(max, rand3);
		max = Math.max(max, rand4);
		max = Math.max(max, rand5);
		System.out.println("MAXIMUM: " + max);
		
	}
}