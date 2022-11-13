
public class RtTriangle extends Shape {

	double width;
	double height;
	private static int numSides = 3;
	public RtTriangle(double width, double height) {this.width=width; this.height=height; super.numSides =numSides;}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height*0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt(height*height +width*width);
	}

}
