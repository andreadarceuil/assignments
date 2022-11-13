
public class ShapeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape rectangle = new Rectangle(4, 3);
		Shape rtTriangl = new RtTriangle(2,3);
		System.out.println("rectangle area is "+rectangle.getArea()+" rectangle Perimeter is "+rectangle.getPerimeter());
		
		System.out.println("right triangle area is "+rtTriangl.getArea()+" right triangle Perimeter is "+rtTriangl.getPerimeter());
		

	}

}
