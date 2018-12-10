package Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("the circle radius has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("the circle radius has radius of " + c2.getRadius() + " and area of " + c2.getArea());
	
		Circle c3 = new Circle();
		c3.setRadius(5.0);
		c3.setColor("green");
		
		Circle c4 = new Circle(5.0);
		
//	    System.out.println(c1.radius);
		System.out.println(c3.getArea());
		System.out.println(c3.toString());
		
		
	}

}
