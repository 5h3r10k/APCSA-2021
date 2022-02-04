package ch4;

public class UsingRectangle {
    
    public static void main(String[] args) {
        
        RectangleStudent a = new RectangleStudent(new Point(0, 4), new Point(2, 2));
        RectangleStudent b = new RectangleStudent(new Point(1, 5), new Point(2, 3));
        RectangleStudent c = new RectangleStudent(new Point(3, 3), new Point(4, 2));
        RectangleStudent d = new RectangleStudent(new Point(1, 6), new Point(7, 1));

        RectangleStudent enc = a.enclose(b);
        enc = enc.enclose(c);
        enc = enc.enclose(d);

        System.out.println("ENCLOSING RECTANGLE: ");
        System.out.println(enc);
        System.out.println(enc.getTL() + " " + enc.getBR());
        System.out.println();

        System.out.println("~~~~ A overlaps: ~~~~");
        if(a.overlap(b)) System.out.println("b");
        if(a.overlap(c)) System.out.println("c");
        if(a.overlap(d)) System.out.println("d");
        System.out.println();

        System.out.println("~~~~ B overlaps: ~~~~");
        if(b.overlap(a)) System.out.println("a");
        if(b.overlap(c)) System.out.println("c");
        if(b.overlap(d)) System.out.println("d");
        System.out.println();

        System.out.println("~~~~ C overlaps: ~~~~");
        if(c.overlap(b)) System.out.println("b");
        if(c.overlap(a)) System.out.println("a");
        if(c.overlap(d)) System.out.println("d");
        System.out.println();

        System.out.println("~~~~ D overlaps: ~~~~");
        if(d.overlap(b)) System.out.println("b");
        if(d.overlap(c)) System.out.println("c");
        if(d.overlap(a)) System.out.println("a");
        System.out.println();

    }

}
