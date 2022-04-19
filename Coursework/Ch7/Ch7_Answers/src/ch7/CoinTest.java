package ch7;

public class CoinTest {
    
    public static void main(String[] args) {
        
        MonetaryCoin mc = new MonetaryCoin(50);
        System.out.println(mc);
        mc.flip();
        System.out.println(mc);

    }

}
