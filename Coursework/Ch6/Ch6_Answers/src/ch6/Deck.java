package ch6;

public class Deck {
    
    private Card[] deck = new Card[52];
    private String[] suits = {"hearts","spades","clubs","diamonds"};

    public Deck() {
        initDeck();
    }

    public void initDeck() {

        for (int i = 0; i < deck.length; i++) {
            deck[i]=new Card(suits[(i)/13], (i)%13+1);
        }

    }

    public void shuffle(){

        int[] shuffleNums = new int[deck.length];
        int randVal;

        for (int i = 0; i < shuffleNums.length; i++) {
            do{
                randVal=(int)((deck.length)*Math.random()+1);
            }while(arrayContains(shuffleNums, randVal));
            shuffleNums[i]=randVal;
        }

        Card[] shuffled = new Card[deck.length];

        for (int i = 0; i < shuffled.length; i++) {
            shuffled[i] = deck[shuffleNums[i]-1];
        }

        deck = shuffled;

    }

    private boolean arrayContains(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val) return true;
        }

        return false;
    }

    public void deal(int numCards){

        Card[] out = new Card[deck.length-numCards];

        for (int i = 0; i < out.length; i++) {
            out[i] = deck[i];
        }

        deck = out;

    }

    public void displayDeck(){
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }



}
