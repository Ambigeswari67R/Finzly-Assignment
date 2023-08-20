package shape;

public class Triangle implements Shape{
	private int base;
	private int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	public void calculateArea() {
		
		System.out.println("Area of Traingle: "+0.5*base*height);
	}
	public void calculateperimeter() {
		System.out.println("perimeter of traingle: "+(3*base));
		
		
	}


}
