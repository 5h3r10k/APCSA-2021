package ch4;

public class Circle {
    
    // data members

    private double radius;


    // constructors

    public Circle(){
        radius = 1;
    }

    public Circle(double r){
        radius = r;
    }


    // methods

    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public boolean equals(Circle target){
        return this.getRadius()==target.getRadius();
    }

    public double getRadius(){
        return radius;
    }

    public String toString(){
        return
        "Circle with: "+"\n"
        +"Radius: "+getRadius()+"\n"
        +"Area: "+area()+"\n"
        +"Circumference"+circumference()+"\n";
    }

}