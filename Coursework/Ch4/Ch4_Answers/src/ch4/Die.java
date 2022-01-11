package ch4;

public class Die {
    
    // DATA MEMBERS
    
    private int numSides;
    private int faceVal;


    // CONSTRUCTORS

    public Die(){
        numSides = 6;
        roll();
    }

    public Die(int sides) {
        numSides = sides;
        roll();
    }


    // METHODS

    public void roll(){
        faceVal = (int)(Math.random()*numSides+1);
    }

    public int getNumSides(){
        return numSides;
    }

    public int getFaceVal(){
        return faceVal;
    }

    public String toString(){
        return
        "- - - - DIE - - - -" + "\n" +
        "# of sides: " + numSides + "\n" +
        "Current face value: " + faceVal;
    }

}
