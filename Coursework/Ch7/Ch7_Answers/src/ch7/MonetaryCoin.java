package ch7;

public class MonetaryCoin extends Coin{
    
    private int value;

    public MonetaryCoin(){
        super();
        this.value = 1;
    }

    public MonetaryCoin(int amt){
        super();
        this.value = amt;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public String toString(){
        return
        this.value + " cent coin on " + (isHeads()?"HEADS":"TAILS");
    }

}
