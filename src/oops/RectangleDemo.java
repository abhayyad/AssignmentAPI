package oops;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle();
		System.out.println(
				"length : " + r1.getLength() + "; " + "breath  : " + r1.getBreath() + "; " +"  Area : " + r1.getArea());

		Rectangle r2 = new Rectangle();
		System.out.println("length : " + r2.getLength() + "; " + "breath  : " + r2.getBreath() + "; " + "  Area : " + r2.getArea());

		Rectangle r3 = new Rectangle();
		r3.setLength(78);
		r3.setBreath(65);
		System.out.println("length : " + r3.getLength() + "; " + "breath  : " + r3.getBreath() + "; " +"  Area : " + r3.getArea());

		// System.out.println("length : " + r3.length + "; " + "breath : "+ r3.breath);
		// above will not work as length and breath are private

	}

}
