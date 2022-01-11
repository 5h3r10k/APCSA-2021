package ch4;

public class RationalRunner {
    
    public static void main(String[] args) {
        
        Rational frac = new Rational(1,3);
        Rational frac2 = new Rational(1,12);
        System.out.print(frac + " - " + frac2 + " = ");
        System.out.print(frac.subtract(frac2)+" or ");
        System.out.println(frac.subtract(frac2).decimalValue());

        frac = new Rational(7,8);
        frac2 = new Rational(1,16);
        System.out.print(frac + " + " + frac2 + " = ");
        System.out.print(frac.add(frac2)+" or ");
        System.out.println(frac.add(frac2).decimalValue());

        frac = new Rational(64,4);
        frac2 = new Rational(256,128);
        System.out.print(frac + " * " + frac2 + " = ");
        System.out.print(frac.multiply(frac2)+" or ");
        System.out.println(frac.multiply(frac2).decimalValue());

        frac = new Rational(16,256);
        frac2 = new Rational(2048,512);
        System.out.print(frac + " / " + frac2 + " = ");
        System.out.print(frac.divide(frac2)+" or ");
        System.out.println(frac.divide(frac2).decimalValue());
        
        frac = new Rational(16,256);
        System.out.println();
        System.out.print(frac + " = " + frac2 +"? ");
        System.out.println(frac.equals(frac2));
        
        frac2 = new Rational(32,512);
        System.out.print(frac + " = " + frac2 +"? ");
        System.out.println(frac.equals(frac2));
        

    }

}
