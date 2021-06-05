package oops.package1;

public class MobileAbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile n1 = new Nokia();		
		Mobile n2 = new Nokia("5800","red");
		n2.setColor("yellow");
		n2.setModel("7000");
	
		
		n1.browsing();
		n1.calling();
		n1.SMSing();	
		
		System.out.println(n1.getColor());
		System.out.println(n1.getModel());
		System.out.println(n2.getColor());
		System.out.println(n2.getModel());
		
		
		Samsung s1 = new Samsung();	
		s1.browsing();
		s1.calling();
		s1.SMSing();
		System.out.println(s1.getColor());
		System.out.println(s1.getModel());
		
	}

}
