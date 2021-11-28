package ch3;

import java.util.Scanner;

public class NumberToLetterGrade {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER NUMBER GRADE:");
		int grade = input.nextInt();
		input.close();
		
		System.out.println();
		System.out.print("LETTER GRADE: ");
		
		if(grade>=90){
			System.out.println("A");
		}else if(grade>=80){
			System.out.println("B");
		}else if(grade>=70){
			System.out.println("C");
		}else if(grade>=65){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
	}
	
}

