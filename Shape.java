
public abstract class Shape {

	int numSides;
	public Shape() {this.numSides =0;}
	public int getSides() {return numSides;}
	public abstract double getArea();
	public abstract double getPerimeter();

}
