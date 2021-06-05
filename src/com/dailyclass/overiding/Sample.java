package com.dailyclass.overiding;

public class Sample {
	
	Shape create() {
		
		int choice;
		choice = 0;		
		
		if(choice==1) {
		Circle c = new Circle();	 	
		return c;	
		}
		else if (choice==2) {
			Rectangle r = new Rectangle();	 	
		return r;	
		}
		else if(choice==3) {
			return new Triangle();	
		}
		else 
		return new Shape();
	}
		

	

	public static void main(String[] args) {
		Sample s = new Sample();
		Shape shape = s.create();
		shape.draw();
		
	}

}
