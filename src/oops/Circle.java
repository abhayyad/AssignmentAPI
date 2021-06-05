package oops;

public class Circle {

	private double radius;
	String color;

	public Circle(double radius, String color) {

		this.radius = radius;
		this.color = color;
	}

	public Circle() {
		this.radius = 12.2;
		this.color = "Red";

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double circleArea() {
		 double area = this.radius * this.radius + Math.PI;
		 return area;
		 	
	}

}
