package ch4;

public class PairOfDice {
    
    //DATA MEMBERS

    private Die d1;
    private Die d2;


    //CONSTRUCTORS

    public PairOfDice(){
        d1 = new Die();
        d2 = new Die();
    }

    public PairOfDice(int s1, int s2){
        d1 = new Die(s1);
        d2 = new Die(s2);
    }


    //METHODS

    public Die getDie1(){
        return d1;
    }

    public Die getDie2(){
        return d2;
    }

    public boolean isHse(){
        return (d1.getFaceVal()==1 ^ d2.getFaceVal()==1);
    }

    public boolean isSe(){
        return (d1.getFaceVal()==1 && d2.getFaceVal()==1);
    }

    public boolean isBoxcar(){
        return (d1.getFaceVal()==d2.getFaceVal() && d1.getFaceVal()==6);
    }

    public void rollDice(){
        d1.roll();
        d2.roll();
    }

    public int sumRoll(){
        return d1.getFaceVal()+d2.getFaceVal();
    }

    public String toString(){
        return d1.toString() + "\n" + d2.toString();
    }

}
