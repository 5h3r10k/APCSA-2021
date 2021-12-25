package ch4;

public class Box {
    
    private double sideLength;

    public Box(){
        sideLength = 2;
    }

    public Box(double s) {
        sideLength = s;
    }

    public double getSideLength(){
        return sideLength;
    }

    public double surfaceArea(){
        return 6 * Math.pow(sideLength,2);
    }

    public String toString(){
        return 
        "BOX: " + "\n"
        + "Side Length: " + getSideLength() + "\n"
        + "Surface Area: " + surfaceArea() + "\n"
        + "Volume: " + volume();
        
    }

    public double volume(){
        return Math.pow(sideLength, 3);
    }

}
