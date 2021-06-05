package com.dailyclass.abstraction;

abstract public class A {

	static int a;

	A() {
		a = 20;
		System.out.println("A constructor called");

	}

	void m1()

	{
		System.out.println("m1 from class A called");

	}

	static void m2() {

		System.out.println("static m2 from class A called");
	}

	abstract void m3();

	public static void main(String[] args) {
		
		m2();
		System.out.println("value of a: " + a);

	}

}
