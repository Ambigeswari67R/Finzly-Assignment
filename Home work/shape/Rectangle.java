package shape;

public class Rectangle implements Shape {
	private int length;
	private int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void calculateArea() {
		
		System.out.println("Area of rectangle: "+length*width);
	}
	public void calculateperimeter() {
		System.out.println("perimeter of rectangle: "+2*(length+width));
		
		
	}

}
