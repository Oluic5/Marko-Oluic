package geometry;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p5 = new Point(5, 6);
		Point p6 = p5;
		Point p7 = new Point(5, 6);
		System.out.println("p5 equals p6: " + p5.equals(p6));
		System.out.println("p5 equals p7: " + p5.equals(p7));
		System.out.println(p5.toString());
		
		Circle c3=new Circle(new Point(3,4),8);
		Donut d= new Donut(new Point(3,4),8,4);
		System.out.println(c3.area());
		System.out.println(d.area());
	}
}
