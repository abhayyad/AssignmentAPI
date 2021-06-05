package oops;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(1.5, "Pink");
		Circle circle3 = new Circle(2.5, "Yellow");
		Circle circle4 = new Circle(3.5, "Green");

		System.out.println("Radius is : " + circle1.getRadius() + "  Area is : " + circle1.circleArea() + " and Color is :"
				+ circle1.color);
		System.out.println("Radius is : " + circle2.getRadius() + "  Area is : " + circle2.circleArea() + " and Color is :"
				+ circle2.color);
		System.out.println("Radius is : " + circle3.getRadius() + "  Area is : " + circle3.circleArea() + " and Color is :"
				+ circle3.color);
		System.out.println("Radius is : " + circle4.getRadius() + "  Area is : " + circle4.circleArea() + " and Color is :"
				+ circle4.color);

	}

}
