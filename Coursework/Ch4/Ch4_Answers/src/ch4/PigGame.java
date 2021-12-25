package ch4;

import java.util.Scanner;

public class PigGame {

    static int d1, d2, pt, ct, pr, cr;
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        
        while(pt<100 && ct<100){
            player();
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
		d1 = (int)(6*Math.random()+1);
		d2 = (int)(6*Math.random()+1);
	}
	
	public static int sumRoll(){
		return d1+d2;
	}
	
	public static boolean isSE(){
		return d1==1 && d1==d2;
	}
	
	public static boolean isHSE(){
		return (d1==1 && d2!=d1) || (d2==1 && d1!=d2);
	}
	
	public static void displayRoll(){
		System.out.println(d1+" , "+d2);
	}

    public static void displayTotals(){
        System.out.println("TOTALS = " + "Player: " + pt + "\t"+"Computer: " + ct);
    }

    public static void displayChoices(){
        System.out.println("0: HOLD / 1: ROLL");
    }

}
