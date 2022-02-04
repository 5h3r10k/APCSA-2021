package ch4;
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
		width = Math.abs(TL.getX()-BR.getX());
		height = Math.abs(TL.getY()-BR.getY());
	}
	
	/*
	 * Create a horizontal rectangle based upon input of two points.
	 * This constructor also initializes width and height of the
	 * rectangle.
	 */
	public RectangleStudent(Point A, Point B){
		TL = A;
		BR = B;
		width = Math.abs(TL.getX()-BR.getX());
		height = Math.abs(TL.getY()-BR.getY());
	}
	
	/*
	 * Creates Rectangle using four double values that represent coordinates
	 * of the top left and bottom right corner of the horizontal rectangle. 
	 */
	public RectangleStudent (double tx, double ty, double bx, double by){
		TL = new Point(tx,ty);
		BR = new Point(bx,by);
		width = Math.abs(TL.getX()-BR.getX());
		height = Math.abs(TL.getY()-BR.getY());
	}

	/*
	* Creates a copy of an already existing rectangle
	*/
	public RectangleStudent(RectangleStudent r){
		TL = new Point(r.getTL().getX()+0.0,r.getTL().getY()+0.0);
		BR = new Point(r.getBR().getX()+0.0,r.getBR().getY()+0.0);
		width = Math.abs(TL.getX()-BR.getX());
		height = Math.abs(TL.getY()-BR.getY());
	}

	
	// A random point from 0-8 inclusive
	private void genTL(){
		int rndX = (int)(9*Math.random());
		int rndY = (int)(9*Math.random());
		TL = new Point(rndX,rndY);
	}
	
	
	// A random point generated to the right and below TL
	private void genBR(){
		int x = (int)((8-TL.getX()+1)*Math.random()+TL.getX());
		int y = (int)((TL.getY()+1)*Math.random());
		BR = new Point(x,y);
	}
	
	// return width
	public double width(){
		return this.width;
	}
	
	// return height
	public double height(){
		return this.height;
	}
	
	// return area
	public double area(){
		return this.height*this.width;
	}
	
	// return perimeter
	public double perimeter(){
		return 2*this.height+2*this.width;
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
		TL.changeX(newX-TL.getX());
		TL.changeY(newY-TL.getY());
	}
	
	// sets new coordinates for the bottom right corner of the rectangle
	public void setBR(double newX, double newY){
		BR.changeX(newX-BR.getX());
		BR.changeY(newY-BR.getY());
	}
	
	// returns true if a point is inside this rectangle and false otherwise
	private boolean inBounds(double mx, double my){
		return (mx<=BR.getX()&&mx>=TL.getX()) && (my<=TL.getY()&&my>=BR.getY());
	}
	
	// returns true if r overlaps with this rectangle and false otherwise. 
	public boolean overlap(RectangleStudent r){
		if (inBounds(r.getTL().getX(), r.getTL().getY())) return true; //testing top left
		if (inBounds(r.getTL().getX()+r.width(), r.getTL().getY())) return true; //testing top right
		if (inBounds(r.getBR().getX(), r.getBR().getY())) return true; //testing bottom right
		if (inBounds(r.getBR().getX()-r.width(), r.getBR().getY())) return true; //testing bottom left
		return false;
	}
	
	// displays information about the rectangle. 
	public String toString(){
		return "Rectangle:\n\tWidth: "+ width() +"\tHeight: " + height();
		
	}

	public RectangleStudent enclose(RectangleStudent rct){
		double minX = Math.min(this.getTL().getX(), rct.getTL().getX());
		double maxX = Math.max(this.getBR().getX(), rct.getBR().getX());
		double minY = Math.min(this.getBR().getY(), rct.getBR().getY());
		double maxY = Math.max(this.getTL().getY(), rct.getTL().getY());

		return new RectangleStudent(minX, maxY, maxX, minY);
	}
		
}
