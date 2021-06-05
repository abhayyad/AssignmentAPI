class Vehicle{
	
	int speed = 90;
	
}

public class Bike extends Vehicle {
	
	int speed = 100;

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		b.show();

	}
	
	

	void show() {
		
		System.out.println("Speed of bike :"+ speed );
		System.out.println("Speed of Vehicle :"+ super.speed);
					
		
	}

}
