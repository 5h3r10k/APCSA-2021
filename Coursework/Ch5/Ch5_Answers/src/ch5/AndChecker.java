package ch5;

public class AndChecker implements Checker{
    
    Checker ch1,ch2;

    public AndChecker(Checker c1, Checker c2){
        ch1 = c1;
        ch2 = c2;
    }

    public boolean accept(String text){
        return ch1.accept(text) && ch2.accept(text);
    }

}
