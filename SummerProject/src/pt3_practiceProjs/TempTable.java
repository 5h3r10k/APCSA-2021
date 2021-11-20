package pt3_practiceProjs;

import java.text.DecimalFormat;

public class TempTable {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.#"); //decimal formatting class instance creation
		
		//INDEPENDENT VARIABLES ---- CAN BE CHANGED BY USER//
		
		int startTemp = 20; //starting temp in F
		int increment = 3; //what the table should increment by
		int iterations = 20; //the number of times it should increment
		
		
		//DEPENDENT VARIABLES ---- DO NOT MODIFY//
		int currentTemp = startTemp; //set a current temp var to be incremented
		
		for(int i=1;i<=iterations;i++){
			
			System.out.print(i+"\t");
			
			System.out.print(currentTemp + " °F" );
			
			System.out.print(" ----> ");
			
			System.out.println(df.format(convToC(currentTemp)) + " °C" );
			
			currentTemp+=increment;
			
		}
		
		
	}
	
	private static double convToC(int tempF) {
		
		return (5.0/9.0)*(tempF-32);
		
	}

}
