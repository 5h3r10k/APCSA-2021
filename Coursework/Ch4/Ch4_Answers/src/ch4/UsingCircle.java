package ch4;

public class UsingCircle {
    
    public static void main(String[] args) {
        
        Circle round1 = new Circle(10);
        Circle round2 = new Circle((int)(Math.random()*(8))+8);
        Circle round3 = new Circle((int)(Math.random()*(8))+8);

        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);

        System.out.println();

        System.out.println("Sum of areas: "+(round1.area()+round2.area()+round3.area()));
        System.out.println("Sum of circumference: "+
        (round1.circumference()+round2.circumference()+round3.circumference()));

        System.out.println();

        System.out.println("round1=round2: "+round1.equals(round2));
        System.out.println("round2=round3: "+round2.equals(round3));
        System.out.println("round3=round1: "+round3.equals(round1));

    }

}
