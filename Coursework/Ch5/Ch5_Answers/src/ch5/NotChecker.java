package ch5;

public class NotChecker implements Checker {
    
    Checker c;

    public NotChecker(Checker i){
        c=i;
    }

    public boolean accept(String text){
        return !c.accept(text);
    }

}
