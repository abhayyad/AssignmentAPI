package oops;

public class CuboidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuboid c1 = new Cuboid();
		System.out.println("Count of shape rec created  : " +  Rectangle.countOfShape);
		System.out.println("Count of shape cuboid created  : " +  Cuboid.countOfShape);
		
		Cuboid c2 = new Cuboid(5, 6, 7);
		
		System.out.println("Count of shape created  : " +  Rectangle.countOfShape);

		System.out.println("Shape Id :  "+c1.getShapeId() + "   length : " + c1.getLength() + "; " + "breath  : " + c1.getBreath() + "; " + "  Area : "
				+ c1.getArea() + " Volume is : " + c1.getVolume());

		System.out.println("Shape Id :  "+c2.getShapeId() + "   length : " + c2.getLength() + "; " + "breath  : " + c2.getBreath() + "; " + "  Area : "
				+ c2.getArea() + " Volume is : " + c2.getVolume());

		Cuboid c3 = new Cuboid();
		c3.setBreath(10);
		c3.setHeight(15);
		c3.setLength(12);

		System.out.println("Shape Id :  "+c3.getShapeId() + "   length : " + c3.getLength() + "; " + "breath  : " + c3.getBreath() + "; " + "  Area : "
				+ c3.getArea() + " Volume is : " + c3.getVolume());
		
		System.out.println("Count of shape created  : " +  Rectangle.countOfShape);

	}

}
