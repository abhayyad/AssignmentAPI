package oops;

public class CylinderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder(1.5, "Pink", 2.55);
		Cylinder cylinder3 = new Cylinder(2.5, "Yellow", 3.55);

		System.out.println("Radius is : " + cylinder1.getRadius() + "    Area is : " + cylinder1.circleArea()
				+ "   and Color is :" + cylinder1.color + "   the volume is : " + cylinder1.getVolume());
		System.out.println("Radius is : " + cylinder2.getRadius() + "    Area is : " + cylinder2.circleArea()
				+ "   and Color is :" + cylinder2.color + "   the volume is : " + cylinder2.getVolume());
		System.out.println("Radius is : " + cylinder3.getRadius() + "    Area is : " + cylinder3.circleArea()
				+ "   and Color is :" + cylinder3.color + "   the volume is : " + cylinder3.getVolume());

	}

}
