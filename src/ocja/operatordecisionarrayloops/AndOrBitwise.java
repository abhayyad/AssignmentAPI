package ocja.operatordecisionarrayloops;

public class AndOrBitwise {

	public static void main(String[] args) {
		 boolean status = true;
	        System.out.println(status = false || (status = true) | (status = false));
	        System.out.println(status);
	        
	        int a = 3;
	        int b = 5;
	        int c = 7;
	        int d = 9;
	        boolean res = --a + --b < 1 && c++ + d++ > 1;
	        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b",a,b, c, d, res);

	}

}
