class VehicleSuperMethod{
	
void show() {
		
		System.out.println("Vehicle Running");
				
	}
	
}

public class BikeSuperMethod extends VehicleSuperMethod {
	
	
	public static void main(String[] args) {
		
		BikeSuperMethod b = new BikeSuperMethod();		
		b.display();
	}
	
	void display() {	
		show();	
		super.show();
	}

	void show() {		
		System.out.println("Bike Running");			
	}

}
