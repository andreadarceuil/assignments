
public class Rectangle extends Shape implements Resizeable {

	double width;
	double height;
	private static int numSides = 4;
public Rectangle(double width, double height) {this.width=width; this.height=height; super.numSides =numSides;}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*width+2*height;
	}
	@Override
	public void resize(double x) {
		// TODO Auto-generated method stub
		width *=x;
		height *=x;
		
	}
	
	public static void main(String[] args) {
		
		Rectangle rectangle2 = new Rectangle(2,3);
		System.out.println("rectangle area is "+rectangle2.getArea()+" rectangle Perimeter is "+rectangle2.getPerimeter());
		rectangle2.resize(2.0);
		System.out.println("rectangle area is "+rectangle2.getArea()+" rectangle Perimeter is "+rectangle2.getPerimeter());
		

	}

}
