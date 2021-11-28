package ch3;

public class SumSequence_1_4 {
	
	public static void main(String[] args) {
		
		int n = 16;
		System.out.println("n = "+n+"\n");
		
		int alph = 65; //start with A
		
		for(int i=0;i<n;i++) {
			System.out.print((char)alph + " "); //print ascii value as char
			alph+=2; //skip a letter
		}
		
	}
	
}
