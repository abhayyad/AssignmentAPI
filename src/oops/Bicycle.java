package oops;

public class Bicycle {
	//instance variables, fields, member variables
	//instance variables determine the state of an object
	
	private int cadence;
	private int speed;
	private int gear;
	
	
	// Still a method, special, method name is same as class name.
	// It does not return anything.
	// initialize the objects.
	// initialize the state of the objects. 
	// initialize the instance variables
	//public Bicycle(int initialSpeed, int cadence , int gear)

	public Bicycle(int cadence, int initialSpeed, int gear) {
	//	System.out.println(this.cadence + "," + this.speed + "," + this.gear);
		this.cadence = cadence;
		if (speed <=60)
			this.speed = initialSpeed;
		this.gear = gear;
		//System.out.println(this.cadence + "," + this.speed + "," + this.gear);
	}
	/* 
	// method overaloading/constructor overloading -polymorphism in Java. 
	 public Bicycle(int cadence, int gear) {
		 this.cadence = cadence;
		 this.gear = gear;
//		 this.speed = 50;
	}
	*/
	// no parameter constructor 
	public Bicycle() {
		cadence = 5;
		speed = 30;
		gear = 2;
	}
	
	//Setter method
	public void setSpeed(int speed) {
		if (speed <=60)
			this.speed = speed;
	//	System.out.println(this.speed);
	}
	
	//getter method
	public int getSpeed() {
		return speed;
	}
	
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getCadence() {
		return cadence;
	}
	
	//abstraction in Java 
	/*private void setCadence(int cadence) {
		if (cadence <=100)
			this.cadence = cadence;
	}
	
	*/
	
	public void bicycleStunts() {
		
	}
	
	public void autoParkFacility() {
		
	}
	
	
}
