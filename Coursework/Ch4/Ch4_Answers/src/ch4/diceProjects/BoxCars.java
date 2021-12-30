package ch4.diceProjects;

public class BoxCars {
    
    public static void main(String[] args) {
        
        //Dice object creation

        Die d1 = new Die();
        Die d2 = new Die();


        //Other var

        int numRolls = 10000000;
        int boxcars = 0;
        double theoretical = (double)1/(d1.getNumSides()*d2.getNumSides());

        
        //process

        for(int i=0;i<numRolls;i++){

            d1.roll();
            d2.roll();

            if(d1.getFaceVal()==6 && d1.getFaceVal()==d2.getFaceVal()){
                boxcars++;
            }

        }


        //output

        System.out.println("Number of rolls: "+numRolls);
        System.out.println("Number of boxcars: "+boxcars);
        System.out.println("Experimental Probability: "+(double)boxcars/numRolls);
        System.out.println("Theoretical Probability: "+theoretical);

        /*
        Need to roll at least 10 million times 
        to accurately converge with theoretical Probability
        */

    }

}
