package pt4_jssCh2;

import java.text.DecimalFormat;
import java.util.Random;

public class Prob13_randomNum {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("000");
		DecimalFormat df2 = new DecimalFormat("0000");
		Random rand = new Random();
		
		int first = rand.nextInt(8);
		int second = rand.nextInt(8);
		int third = rand.nextInt(8);
		
		int mid = rand.nextInt(742);
		
		int last = rand.nextInt(10000);
		
		System.out.println("RANDOM PHONE NUMBER\n");
		
		
		System.out.println("("+first+""+second+""+third+") - "+df.format(mid)+" - "+df2.format(last));
		
		
	}

}
