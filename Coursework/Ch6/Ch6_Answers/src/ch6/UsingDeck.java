package ch6;

public class UsingDeck {
    
    public static void main(String[] args) {
        
        Deck d1 = new Deck();
        d1.shuffle();
        d1.deal(45);
        d1.shuffle();
        d1.displayDeck();

    }

}
