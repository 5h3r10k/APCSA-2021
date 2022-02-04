
/* 
 * Any Horizontal Rectangle can be defined by two points: top left corner and the
 * bottom right corner 
 */
public class RectangleStudent {
	private Point TL;
	private Point BR;
	double width;
	double height;
	
	/*
	 * Default constructor sets top left and bottom right to random
	 * coordinates between 0-299. Set width and height based upon the 
	 * points. 
	 */
	public RectangleStudent(){
		genTL();
		genBR();
		
	}
	
	/*
	 * Create a horizontal rectangle based upon input of two points.
	 * This constructor also initializes width and height of the
	 * rectangle.
	 */
	public RectangleStudent(Point A, Point B){
	
	}
	
	/*
	 * Creates Rectangle using four double values that represent coordinates
	 * of the top left and bottom right corner of the horizontal rectangle. 
	 */
	public RectangleStudent (double tx, double ty, double bx, double by){
		
	}
	
	// A random point from 0-299 inclusive
	private void genTL(){
		
	}
	
	
	// A random point generated to the right and below TL
	private void genBR(){
		
	}
	
	// return width
	public double width(){
		return 0;
	}
	
	// return height
	public double height(){
		return 0;
	}
	
	// return area
	public double area(){
		return 0;
	}
	
	// return perimeter
	public double perimeter(){
		return 0;
	}
	
	// return top left point
	public Point getTL(){
		return TL;
	}
	
	// return bottom right point
	public Point getBR(){
		return BR;
	}
	
	// sets new coordinates for the top left corner
	public void setTL(double newX, double newY){
		
	}
	
	// sets new coordinates for the bottom right corner of the rectangle
	public void setBR(double newX, double newY){
		
	}
	
	// returns true if a point is inside this rectangle and false otherwise
	private boolean inBounds(float mx, float my){
		return true;
	}
	
	// returns true if r overlaps with this rectangle and false otherwise. 
	public boolean overlap(Rectangle r){
		inBounds(3, 8);
		return true;
	}
	
	// displays information about the rectangle. 
	public String toString(){
		return "Rectangle:\n\tWidth: "+ width() +"\tHeight: " + height();
		
	}
		
}
