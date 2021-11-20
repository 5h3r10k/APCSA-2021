package pt3_practiceProjs;

import java.lang.Math;
import java.text.DecimalFormat;

public class GravityCalculator {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(".#");
		
		double gravity = -9.81; //earth's gravitational acceleration in m/s^2
		double initialVelocity = 0.0;
		double fallingTime  =  10.0; 
		double initialPosition =  0.0; 
		double finalPosition  =  (0.5)*(gravity)*(Math.pow(fallingTime, 2)) + (initialVelocity)*(fallingTime) + (initialPosition);
		String finalPos = df.format(finalPosition);
		System.out.println("The  object's position  after  " + fallingTime  + "  seconds is  " +  finalPos + "  m");
		
	}

}

/*

Output before modification:

"The  object's position  after  10.0  seconds is  0.0  m"

*/