package ch5;

public class CheckingYummy {
    
    public static void main(String[] args) {
        
        Checker aChecker = new SubstringChecker("artichokes");
        Checker kChecker = new SubstringChecker("kale");
        Checker yummyChecker;

        yummyChecker = new AndChecker(new NotChecker(aChecker),new NotChecker(kChecker));

        System.out.println(yummyChecker.accept("kale artichokes"));

    }

}
