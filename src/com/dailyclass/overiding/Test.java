package com.dailyclass.overiding;

// Method overriding

class Shape {

	void draw() {

		System.out.println("Drawing no shape");
	}

}

class Rectangle extends Shape {

	void draw() {

		System.out.println("Drawing Rectangle");
	}

}

class Triangle extends Shape {

	void draw() {

		System.out.println("Drawing Triangle");
	}

}

class Circle extends Shape {

	void draw() {

		System.out.println("Drawing circle");
	}

}

public class Test {

	public static void main(String[] args) {

		Shape s;
		s = new Shape();
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();

	}

}
