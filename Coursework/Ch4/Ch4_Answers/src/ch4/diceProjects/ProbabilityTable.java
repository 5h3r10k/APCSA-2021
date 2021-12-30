package ch4.diceProjects;

public class ProbabilityTable {
    
    static Die d1 = new Die();
    static Die d2 = new Die();
    static Die d3 = new Die();
    static Die d4 = new Die();
    static Die d5 = new Die();

    public static void main(String[] args) {
        
        probTable(100);
        probTable(1000);
        probTable(10000);
        probTable(100000);
        
    }

    public static void probTable(int numRolls){

        int sum15 = 0,sum5_10 = 0,sum20 = 0,sum15_25 = 0;

        for(int i=0;i<numRolls;i++){

            rollAll();

            if(sumRoll()==15) sum15++;
            if(sumRoll()>=5 && sumRoll()<=10) sum5_10++;
            if(sumRoll()==20) sum20++;
            if(sumRoll()>=15 && sumRoll()<=25) sum15_25++;

        }

        System.out.println("|================ "+numRolls+" ROLLS ================|");
        System.out.println();

        System.out.println("---- sum of 15 ----");
        System.out.println("Count: "+sum15);
        System.out.println("Probability: "+(double)sum15/numRolls);
        System.out.println();

        System.out.println("---- sum between 5 and 10 ----");
        System.out.println("Count: "+sum5_10);
        System.out.println("Probability: "+(double)sum5_10/numRolls);
        System.out.println();

        System.out.println("---- sum of 20 ----");
        System.out.println("Count: "+sum20);
        System.out.println("Probability: "+(double)sum20/numRolls);
        System.out.println();

        System.out.println("---- sum between 15 and 25 ----");
        System.out.println("Count: "+sum15_25);
        System.out.println("Probability: "+(double)sum15_25/numRolls);
        System.out.println();

    }

    public static int sumRoll(){
        return d1.getFaceVal() + d2.getFaceVal() + d3.getFaceVal() 
        + d4.getFaceVal() + d5.getFaceVal();
    }

    public static void rollAll(){
        d1.roll();
        d2.roll();
        d3.roll();
        d4.roll();
        d5.roll();
    }

}
