package ch4.diceProjects;

import java.util.Scanner;

public class PigGame {

    static int pt, ct, pr, cr;
    static Scanner scn = new Scanner(System.in);
    static PairOfDice dice = new PairOfDice();

    public static void main(String[] args) {
        
        while(pt<100 && ct<100){
            player();
            if(!(pt<100 && ct<100)) break;
            computer();
        }

        System.out.println();

        if(pt>ct){
            System.out.println("PLAYER WINS!");
        }else{
            System.out.println("COMPUTER WINS!");
        }
        
    }

    public static void player(){

        System.out.println("\n---------------- PLAYER");

        int playerchoice;
        pr = 0;

        while(true){

            displayTotals();
            displayChoices();
            System.out.print("Enter choice: ");
            playerchoice = scn.nextInt();
            System.out.println();

            if(playerchoice==1){
                rollDice();
                displayRoll();

                if(isHSE()){
                    System.out.println("Half snake eyes! Round score reset, turn forfeited.");
                    pr=0;
                    break;
                }else if(isSE()){
                    System.out.println("Snake eyes! Total score reset, turn forfeited.");
                    pt=0;
                    pr=0;
                    break;
                }else{
                    System.out.println("Roll total: "+sumRoll());
                    pr+=sumRoll();
                }

            }else{
                System.out.println("Holding...");
                pt+=pr;
                break;
            }

        }

    }

    public static void computer(){
        System.out.println("\n---------------- COMPUTER");
        cr = 0;
        displayTotals();

        while(cr<20){

            rollDice();
            displayRoll();

            if(isSE()){
                System.out.println("Snake eyes! Total score reset, turn forfeited.");
                cr=0;
                ct=0;
                break;
            }else if(isHSE()){
                System.out.println("Half snake eyes! Round score reset, turn forfeited.");
                cr=0;
                break;
            }else{
                cr+=sumRoll();
            }

            //displayTotals();

        }

        ct+=cr;
        displayTotals();


    }

    public static void rollDice(){
		dice.rollDice();
	}
	
	public static int sumRoll(){
		return dice.sumRoll();
	}
	
	public static boolean isSE(){
		return dice.isSe();
	}
	
	public static boolean isHSE(){
		return dice.isHse();
	}
	
	public static void displayRoll(){
		System.out.println(dice.getDie1().getFaceVal()
				+" , "+dice.getDie2().getFaceVal());
	}

    public static void displayTotals(){
        System.out.println("TOTALS = " + "Player: " + pt + "\t"+"Computer: " + ct);
    }

    public static void displayChoices(){
        System.out.println("0: HOLD / 1: ROLL");
    }
}
