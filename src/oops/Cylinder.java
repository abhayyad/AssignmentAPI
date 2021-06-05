package oops;

public class Cylinder extends Circle {

	double height;

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public Cylinder() {
		super();
		this.height = 10;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double circleArea() {
		double area = 2 * Math.PI * this.height * super.getRadius() + 2 * super.circleArea();
		return area;
	}

	public double getVolume() {

		double volume = 2 * this.height * super.circleArea();
		return volume;
	}

}
