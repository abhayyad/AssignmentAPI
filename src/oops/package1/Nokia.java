package oops.package1;

public class Nokia extends Mobile {

	public Nokia() {
		super();
	}

	public Nokia(String model, String color) {
		super(model, color);
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling from Nokia");

	}

	@Override
	public void SMSing() {
		// TODO Auto-generated method stub
		System.out.println("SMSing from Nokia");
	}

	@Override
	public void browsing() {
		// TODO Auto-generated method stub
		System.out.println("Browsing from Nokia");

	}

}
