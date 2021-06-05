package oops;

public class LearnExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		a = b=5;
		c = 10;
		
		try {
		d= c/(a-b);		
		System.out.println("value of d" + d);	}
		catch (ArithmeticException e) {
			System.out.println("enter diffrent value of a and b");
		}
	//	throw e;
	//	e.printStackTrace();
		
		
	    Thread.sleep(5000);
		
		System.out.println("hi");

	}

}
