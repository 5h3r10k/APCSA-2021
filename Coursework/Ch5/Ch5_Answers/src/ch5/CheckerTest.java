package ch5;

public class CheckerTest {
    
    public static void main(String[] args) {
        
        Checker broccoliChecker = new SubstringChecker("broccoli");
        Checker gChecker = new SubstringChecker("good");
        Checker isChecker = new SubstringChecker("is");
        Checker andChecker = new AndChecker(gChecker, isChecker);
        Checker aChecker = new AndChecker(andChecker, broccoliChecker);
        Checker nChecker = new NotChecker(aChecker);
        System.out.println(nChecker.accept("broccoli is good"));

    }

}
