package com.dailyclass.abstraction;

public class B extends A {
	
	B(){
		
	//	super();	implicit super is called	
		System.out.println("Constructor B");
		
	}	
	

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		b.m3();
		m2();
		
		

	}

	@Override
	void m3() {
		
		System.out.println("static m3 from class B called");
	}

}
