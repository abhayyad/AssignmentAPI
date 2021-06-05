package ocja.operatordecisionarrayloops;

public class SwitchStatement {

	public static void main(String[] args) {
		
		  byte var = 100;
	        switch(var) {
	            case 100:
	                System.out.println("var is 100");
	                break;
	            case (byte) 200:
	                System.out.println("var is 200");
	                break;
	            default:
	                System.out.println("In default");
	        }	
		

	}

}


/*
 * switch expression can accept following:
 * 
 * char or Character,
 * 
 * byte or Byte,
 * 
 * short or Short,
 * 
 * int or Integer,
 * 
 * An enum only from Java 6,
 * 
 * A String expression only from Java 7.
 */


