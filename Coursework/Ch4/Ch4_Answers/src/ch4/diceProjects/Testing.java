package ch4.diceProjects;

public class Testing {

    public static void main(String[] args) {
        
        PairOfDice dice = new PairOfDice(5,6);

        System.out.println(dice.toString());
        System.out.println(dice.sumRoll());
        System.out.println(dice.isHse());
        System.out.println(dice.isSe());

    }

}
