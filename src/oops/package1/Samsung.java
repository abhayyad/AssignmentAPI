package oops.package1;

public class Samsung extends Mobile {
	
	

	public Samsung() {
		super();
		
	}

	public Samsung(String model, String color) {
		super(model, color);
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub0
		
	System.out.println("Calling from Samsung");
		
	}

	@Override
	public void SMSing() {
		// TODO Auto-generated method stub
		System.out.println("SMSing from Samsung");
		
	}

	@Override
	public void browsing() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from Samsung");
		
	}

}
