package ch4;

public class RectangleTester {
    public static void main(String[] args) {
        RectangleStudent r1 = new RectangleStudent();
        System.out.println(r1.getTL());
        System.out.println(r1.getBR());

        System.out.println();

        RectangleStudent r2 = new RectangleStudent();
        System.out.println(r2.getTL());
        System.out.println(r2.getBR());

        System.out.println(r1.overlap(r2));
    }
}
