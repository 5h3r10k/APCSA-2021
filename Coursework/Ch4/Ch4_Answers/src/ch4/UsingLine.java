package ch4;

import java.util.Scanner;

public class UsingLine {
	
	static Line t;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice = menu();
		createLine(choice);
		
		System.out.println(t);

	}
	
	public static void createLine(int c) {
		double slope, yInt,x1,y1,x2,y2;
		int A,B,C;
		Point p1,p2;
		if(c == 1) {
			t = new Line();
		}else if(c == 2) {
			pln("Enter slope: ");
			slope = scn.nextDouble();
			pln("Enter y-intercept: ");
			yInt =  scn.nextDouble();
			t = new Line(slope, yInt);
		}else if(c == 3){
			pln("Enter slope: ");
			slope = scn.nextDouble();
			pln("Enter x of point: ");
			x1 = scn.nextDouble();
			pln("Enter y of point: ");
			y1 = scn.nextDouble();
			p1 = new Point(x1,y1);
			t = new Line(p1,slope);
		}else if(c == 4){
			pln("Enter x of point 1: ");
			x1 = scn.nextDouble();
			pln("Enter y of point 1: ");
			y1 = scn.nextDouble();
			pln("Enter x of point 2: ");
			x2 = scn.nextDouble();
			pln("Enter y of point 2: ");
			y2 = scn.nextDouble();
			p1 = new Point(x1,y1);
			p2 = new Point(x2,y2);
			t = new Line(p1,p2);
		}else if(c == 5){
			pln("");
			pln("Ax+By=C");

			pln("Enter A: ");
			A = scn.nextInt();
			pln("Enter B: ");
			B = scn.nextInt();
			pln("Enter C: ");
			C = scn.nextInt();

			t = new Line(A,B,C);

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
