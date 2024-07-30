package polymorphism;

class shape {
	public double getArea() {
		return 0;
	}
}
class rectangle extends shape{
	private double width ;
	private double height ;
	
	public rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}

class circle extends shape{
	private double r;
	
	public circle(double r) {
		this.r = r;
	}
	public double getArea() {
		return 3.14 *r*r; 
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape[] s = new shape[2];
		
		s[0]= new rectangle(2,4);
		s[1]= new circle(2);
		
		System.out.println("Area of rectangle is: " + s[0].getArea());
		System.out.println("Area of circle is: " + s[1].getArea());

	}

}
