package ch4;

public class Boxcars_pair {
    
    public static void main(String[] args) {
        
        PairOfDice dice = new PairOfDice();
        int boxcars = 0;
        int rolltimes = 1000;


        for (int i = 0; i < rolltimes; i++) {
            if(dice.isBoxcar()) boxcars++;
            dice.rollDice();
        }

        System.out.println("Number of rolls: "+rolltimes);
        System.out.println("Number of boxcars: "+boxcars);


    }
    
    
}
