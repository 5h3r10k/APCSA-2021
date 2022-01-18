package learningClasses;
import java.util.Scanner;

import ch4.Line;
public class UsingLine {
	
	static Line t;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice = menu();
		createLine(choice);
		
		System.out.println(t);
		
	}
	
	public static void createLine(int c) {
		double slope, yInt;
		if(c == 1) {
			t = new Line();
		}else if(c == 2) {
			pln("Enter slope: ");
			slope = scn.nextDouble();
			pln("Enter y-intercept: ");
			yInt =  scn.nextDouble();
			t = new Line(slope, yInt);
		}
		
	}
	
	public static int menu() {
		pln("Equation of a line creator program");
		pln("Select the input type to create a line");
		pln("1: Default Line y = x");
		pln("2: Slope-Intercept");
		pln("3: Point-Slope");
		pln("4: Two Points");
		pln("5: Standard Form");
		
		return scn.nextInt();
	}
	
	public static void pln(String s) {
		System.out.println(s);
	}

}
