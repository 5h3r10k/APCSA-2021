package ch4.diceProjects;

import java.util.Scanner;

public class DiceGraph {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        PairOfDice dice = new PairOfDice();

        int sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9,sum10,sum11,sum12;
        sum2=sum3=sum4=sum5=sum6=sum7=sum8=sum9=sum10=sum11=sum12=0;

        System.out.print("How many times to roll the dice: ");
        int times = input.nextInt();
        System.out.println();
        input.close();

        for (int i = 0; i < times; i++) {
            dice.rollDice();

            if(dice.sumRoll()==2){
                sum2++;
            }else if(dice.sumRoll()==3){
                sum3++;
            }else if(dice.sumRoll()==4){
                sum4++;
            }else if(dice.sumRoll()==5){
                sum5++;
            }else if(dice.sumRoll()==6){
                sum6++;
            }else if(dice.sumRoll()==7){
                sum7++;
            }else if(dice.sumRoll()==8){
                sum8++;
            }else if(dice.sumRoll()==9){
                sum9++;
            }else if(dice.sumRoll()==10){
                sum10++;
            }else if(dice.sumRoll()==11){
                sum11++;
            }else{
                sum12++;
            }

        }

        System.out.println("SUM"+"\t"+"# of rolls");
        System.out.println("2"+"\t"+sum2);
        System.out.println("3"+"\t"+sum3);
        System.out.println("4"+"\t"+sum4);
        System.out.println("5"+"\t"+sum5);
        System.out.println("6"+"\t"+sum6);
        System.out.println("7"+"\t"+sum7);
        System.out.println("8"+"\t"+sum8);
        System.out.println("9"+"\t"+sum9);
        System.out.println("10"+"\t"+sum10);
        System.out.println("11"+"\t"+sum11);
        System.out.println("12"+"\t"+sum12);

    }

}
