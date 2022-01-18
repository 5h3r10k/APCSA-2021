package ch4;

public class LineRunner {
    
    public static void main(String[] args) {
        
        Line l1 = new Line(2,3);
        Line l2 = new Line(new Point(2,3),3);
        Line l3 = new Line(new Point(1,2),new Point(3,7));
        Line l4 = new Line(2,3,4);
        Line l5 = new Line(new Point(7,4),new Point(7,7));
        Line l6 = new Line(2,0,4);
        Line l7 = new Line(0,3,9);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(l7);

    }

}
