package ch4;

public class Point {
    
    // data members

    private double x,y;


    // constructors

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }


    // get-set methods

    public double getX() {
        return x;
    }

    public void changeX(double dx) {
        this.x += dx;
    }

    public double getY() {
        return y;
    }

    public void changeY(double dy) {
        this.y += dy;
    }


    // other methods

    public double distanceTo(Point p){
        int dx = (int)Math.abs(p.x-this.x);
        int dy = (int)Math.abs(p.y-this.y);
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }

    public boolean equals(Point p){
        return
        Math.abs(this.x-p.x)<0.01 &&
        Math.abs(this.y-p.y)<0.01;
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }

}
