package assignment;

public class CalculatorImp {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		ScientificCalculator sc = new ScientificCalculator();

		System.out.println(c.add(123, 234));
		System.out.println(c.division(123, 34));
		System.out.println(c.substract(234, 45));
		System.out.println(c.multiplication(34, 78));

		System.out.println(sc.add(60, 23));
		System.out.println(sc.substract(60, 23));
		System.out.println(sc.division(60, 23));
		System.out.println(sc.multiplication(60, 23));

		System.out.println(sc.sin(45.89));
		System.out.println(sc.cos(45.89));

	}
}
