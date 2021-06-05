package com.dailyclass.abstraction;

//abstract method - method without body
// whenever a class has abstract method class have to be made abstract
// abstract class cannot be instantiated , need to be extended
// Abstract class may or may not have abstract method
// abstract method of super class should be implemented in child class
// or child class should be made abstract

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing circle");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing rectancle");
	}
}

abstract class Triangle extends Shape {
}

class UpperTriangle extends Triangle {

	@Override
	void draw() {
		System.out.println("Drawing upper triangle");

	}
	
	void drawUT() {
		
		System.out.println("Calling upper triangle class method");
	}
}

class LowerTriangle extends Triangle {

	@Override
	void draw() {
		System.out.println("Drawing lower triangle");

	}
}

public class Test {
	public static void main(String[] args) {

		// Shape s = new Shape(); instantiation not allowed
		
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();

		// Triangle t = new Triangle();  instantiation not allowed
		
		UpperTriangle ut = new UpperTriangle();
		LowerTriangle lt = new LowerTriangle();
		
		c.draw();
		r.draw();
		lt.draw();
		ut.draw();
		
		Shape s = new Rectangle();		
		s.draw();
		s = new LowerTriangle();		
		s.draw();
		s = new UpperTriangle();
	//	s.drawUT();
		ut.drawUT();

	}
}
