package ch4;

public class Line {

	//how do you define a line? y =mx+b
	private double m;
	private double b;
	private boolean isVertical;
	private double xIntercept;
	

	//********************************************************************************************************************************
	//Constructors

	//default y = x
	public Line() {
		m = 1;
        b = 0;
        isVertical = false;
        setXintercept();
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
		m = slope;
        b = P.getY()-m*P.getX();
		setXintercept();
	}
	
	//Two Points
	public Line(Point P, Point Q) {
		if(P.getX()==Q.getX()){ 
            isVertical=true;
            xIntercept=P.getX();
        } else {

            m = (P.getY()-Q.getY())/(P.getX()-Q.getX());
            b = P.getY()-m*P.getX();
            setXintercept();

        }
	}
	
	//Standard Form:  Ax+By=C
	public Line(int A, int B, int C) {
		
		if(B!=0){
			m = -(double)A/B;
        	b = (double)C/B;
			setXintercept();
		}else{
			this.isVertical = true;
			this.xIntercept = (double)C/A;
		}
		
	}
	

	
	//********************************************************************************************************************************
	// Getters - setters

	public boolean isVertical(){
		return this.isVertical;
	}

	public double getXintercept(){
		return this.xIntercept;
	}

	public double getSlope(){
		return this.m;
	}

	//********************************************************************************************************************************
	// other methods

	private void setXintercept() {
		if(m==0) {
			//System.out.println("Horizontal line, no x Intercept");
		}else {
			xIntercept = -1*b/m;
		}
	}
	
	public String toString() {
        if(isVertical) return "Vertical line with x-intercept of "+xIntercept;
		return "y = "+m+"x + "+b;
	}

	public double getY(double x){
		if(this.isVertical()) return this.getXintercept();
		return (this.m*x)+b;
	}

	public Point intersection(Line l2){

		/**
		 * Scenarios
		 * - 2 parallel vertical lines (DONE)
		 * - 2 coincident vertical lines (DONE)
		 * - One vertical, one not (DONE)
		 * - 2 parallel non-vertical lines (DONE)
		 * - 2 coincident non-vertical lines (DONE)
		 * - 2 non-vertical lines (DONE)
		 */
		
		double x=0,y=0;

		if(this.isVertical() && l2.isVertical()){
			if(this.getXintercept()==l2.getXintercept()){
				// 2 coincident vertical lines
				System.out.println("Consistent system, infinite solutions");
				return null;
			}
			// 2 parallel vertical lines
			System.out.println("Inconsistent system, no solution");
			return null;
		}

		if(this.isVertical() || l2.isVertical()){
			if(this.isVertical()){
				x = this.getXintercept();
				y = l2.getY(x);
			}else if(l2.isVertical()){
				x = l2.getXintercept();
				y = this.getY(x);
			}

			return new Point(x,y);
		}

		if(this.getSlope()==l2.getSlope()){

			if(this.b==l2.b){
				System.out.println("Consistent system, infinite solutions");
				return null;
			}

			System.out.println("Inconsistent system, no solution");
			return null;

		}


		x = (l2.b-this.b)/(this.m-l2.m);
		y = this.getY(x);
		return new Point(x,y);

	}

}
