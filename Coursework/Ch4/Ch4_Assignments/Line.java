package learningClasses;

public class Line {
	//how do you define a line? y =mx+b
	private double m;
	private double b;
	private boolean isVertical;
	private double xIntercept;
	
	//Constructors
	//default y = x
	public Line() {
		
	}
	
	//Slope-intercept
	public Line(double slope, double yIntercept) {
		m = slope;
		b = yIntercept;
		isVertical = false;
		setXintercept();
	}
	
	//Point Slope
	public Line(Point P, double slope) {
		
		
	}
	
	//Two Points
	public Line(Point P, Point Q) {
		
	}
	
	//Standard Form:  Ax+By=C
	public Line(int A, int b, int C) {
		
	}
	

	private void setXintercept() {
		if(m==0) {
			System.out.println("Horizontal line, no x Intercept");
		}else {
			xIntercept = -1*b/m;
		}
	}
	
	public String toString() {
		return "y = "+m+"x + "+b;
	}

}
