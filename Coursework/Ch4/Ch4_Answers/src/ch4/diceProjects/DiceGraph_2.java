package ch4.diceProjects;

import java.util.Scanner;

/**
 * More efficient version of {@link DiceGraph}
 * This version uses an integer array 
 * instead of vars for each roll sum. 
 * Less lines of code too.
 */


public class DiceGraph_2 {
    
    public static void main(String[] args) {
        
        //receiving user input
        Scanner input = new Scanner(System.in);
        PairOfDice pair = new PairOfDice();
        System.out.print("How many times to roll: ");
        int times = input.nextInt();
        System.out.println();
        input.close();

        // creating the array
        int[] totals = new int[11];

        // rolling and storing data
        for (int i = 0; i < times; i++) {
            pair.rollDice();

            totals[pair.sumRoll()-2]++;
        }

        
        /* OUTPUT */

        // header for output
        System.out.println("Sum\t# of Rolls");

        // iterate over array and display each value
        for (int i = 2; i <= totals.length+1; i++) {
            System.out.println(i+"\t"+totals[i-2]);
        }

    }

}
