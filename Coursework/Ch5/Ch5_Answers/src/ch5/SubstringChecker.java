package ch5;

public class SubstringChecker implements Checker{
    
    String phrase;

    public SubstringChecker(String s){
        phrase = s;
    }

    public boolean accept(String text){
        return text.contains(phrase);
    }

}
