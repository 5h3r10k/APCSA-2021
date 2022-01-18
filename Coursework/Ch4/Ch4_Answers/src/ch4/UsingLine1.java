package ch4;

public class UsingLine1 {
    
    public static void main(String[] args) {
        
        Line l1 = new Line(); // y=x
        Line l2 = new Line(3,1); // y=3x+1
        Line l3 = new Line(0,5); // y=5
        Line l4 = new Line(new Point(2,0),new Point(2,2)); // x=2

        //printing out all the lines
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        System.out.println();

        System.out.println(l1.intersection(l2));
        System.out.println(l1.intersection(l3));
        System.out.println(l1.intersection(l4));
        System.out.println(l2.intersection(l3));
        System.out.println(l2.intersection(l4));
        System.out.println(l3.intersection(l4));

        

    }

}
