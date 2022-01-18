package ch4;

import java.util.Scanner;

public class SysOfEq {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Line l1,l2;
        int userChoice;

        System.out.println("~~~~~~~~~~~~~~~~SYSTEM OF EQUATIONS SOLVER~~~~~~~~~~~~~~~~");
        System.out.println();

        while (true) {
            
            System.out.println("Line 1: ");
            menu();
            do{ userChoice = input.nextInt();
            }while(userChoice>4 || userChoice<1);

            l1 = makeLine(userChoice);
            System.out.println("\nLINE 1: "+l1);
            System.out.println();


            System.out.println("Line 2: ");
            menu();
            do{ userChoice = input.nextInt();
            }while(userChoice>4 || userChoice<1);

            l2 = makeLine(userChoice);
            System.out.println("\nLINE 2: "+l2);
            System.out.println();
            System.out.println();

            getSystem(l1, l2);

            System.out.println();
            System.out.println("Repeat (1) or quit (0)?");
            userChoice = input.nextInt();
            if(userChoice==0) break;

            System.out.println("\n");


        }
        
        System.out.println("Thank you, goodbye!");

    }

    public static void menu(){
        System.out.println("Choose an input type:");
        System.out.println("1. Slope and Y-Intercept");
        System.out.println("2. Two Points");
        System.out.println("3. Point and Slope");
        System.out.println("4. Standard Form (Ax+By=C) coefficients");
        System.out.println();
    }

    public static Line makeLine(int c){

        double slope, yInt,x1,y1,x2,y2;
		int A,B,C;
		Point p1,p2;

		if(c == 1) {
			System.out.println("Enter slope: ");
			slope = input.nextDouble();
			System.out.println("Enter y-intercept: ");
			yInt =  input.nextDouble();
			return new Line(slope, yInt);
		}else if(c == 3){
			System.out.println("Enter slope: ");
			slope = input.nextDouble();
			System.out.println("Enter x of point: ");
			x1 = input.nextDouble();
			System.out.println("Enter y of point: ");
			y1 = input.nextDouble();
			p1 = new Point(x1,y1);
			return new Line(p1,slope);
		}else if(c == 2){
			System.out.println("Enter x of point 1: ");
			x1 = input.nextDouble();
			System.out.println("Enter y of point 1: ");
			y1 = input.nextDouble();
			System.out.println("Enter x of point 2: ");
			x2 = input.nextDouble();
			System.out.println("Enter y of point 2: ");
			y2 = input.nextDouble();
			p1 = new Point(x1,y1);
			p2 = new Point(x2,y2);
			return new Line(p1,p2);
		}else if(c == 4){
			System.out.println("");
			System.out.println("Ax+By=C");

			System.out.println("Enter A: ");
			A = input.nextInt();
			System.out.println("Enter B: ");
			B = input.nextInt();
			System.out.println("Enter C: ");
			C = input.nextInt();

			return new Line(A,B,C);

		}

        return null;
    }

    public static void getSystem(Line line1,Line line2) {
        System.out.println("The solution for the following system: ");
        System.out.println("{");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println("}\n");

        if(line1.getSlope()==line2.getSlope() && line1.getXintercept()!=line2.getXintercept()){
            System.out.println("Inconsistent system. No solutions due to parallel lines.");
        }else if(line1.getSlope()==line2.getSlope()){
            System.out.println("Consistent and dependent system. Infinite solutions due to coincident lines.");
        }else{
            System.out.println("Consistent and independent system. Solution = "+line1.intersection(line2));
        }
    }

}
