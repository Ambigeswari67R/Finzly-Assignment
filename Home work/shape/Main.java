package shape;

public class Main {
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		circle.calculateArea();
		circle.calculateperimeter();
		
		Rectangle rectangle=new Rectangle(10,8);
		rectangle.calculateArea();
		rectangle.calculateperimeter();
		
		Triangle triangle=new Triangle(5,10);
		triangle.calculateArea();
		triangle.calculateperimeter();
		
		
		
	}

}
