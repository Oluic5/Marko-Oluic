package geometry;

public class Donut extends Circle {

	private int innerR;

	public Donut() {
	
	}
	
	public Donut(Point center,int r,int innerR) {
		super(center,r);
		this.innerR=innerR;
	}
	
	public Donut(Point center,int r,int innerR,boolean selected) {
		super(center,r,selected);
		this.innerR=innerR;
	}
	
	@Override
	public String toString() {
		return super.toString() + "inner radius :" + innerR;
	}
	
	@Override
	public double area() {
		return super.area() - innerR*innerR*Math.PI;
	}
	
	@Override
	public double circumference() {
		return super.circumference() + 2*innerR*Math.PI;
	}
	
	//domaci override equals metoda
	
	
	public int getInnerR() {
		return innerR;
	}

	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}
	
	
}
