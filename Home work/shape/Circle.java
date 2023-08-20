package shape;

public class Circle implements Shape{
	 private int radius;

	 public Circle(int radius) {
	        this.radius = radius;
	 }
	public void calculateArea() {
		double area= (3.14*radius*radius);
		System.out.println("Area of circle: "+area);
	}
	public void calculateperimeter() {
		System.out.println("perimeter of circle: "+(double)(2*3.14*radius));
		
		
	}

}
