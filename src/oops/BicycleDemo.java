package oops;

public class BicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 = new Bicycle(10,60,4); //own copy of g,c,s
	//	int i;
		System.out.println(bike1.getSpeed());
		bike1.setSpeed(30);		
		System.out.println(bike1.getSpeed());
		bike1.setSpeed(70);
		System.out.println(bike1.getSpeed());
	
		
		Bicycle bike2 = new Bicycle();//own copy of g,c,s
		
		bike1 = bike2;
		System.out.println("Speed - " + bike1.getSpeed());
		bike1.setGear(5);
		System.out.println("bike1 gear - " + bike1.getGear());
		System.out.println("bike2 gear - " + bike2.getGear());
		// Bicycle bike3,bike4;

	//	bike3 = new Bicycle();
	//	bike4 = new Bicycle();
		
	}

}
