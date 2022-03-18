package ch6.frq;

public class TokenTest {
    
    public static void main(String[] args) {
        
        TokenPass tp = new TokenPass(4);
        System.out.println(tp);
        tp.distributeCurrentPlayerTokens();
        System.out.println(tp);

    }

}
