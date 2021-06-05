package assignment;

public class Assignment2_DataTypes {

	public static void main(String[] args) {
		
		char character = 'A';
		
		byte value = 100;
		short shortint =32700;		
		int integer = -2147483648;
		long longint = 9223372036854775807l;
		
		float floatDecimal = 87987897.7987897786786787876687678668778786555446466867867687678786776868687f;
		double doubleDecimal = 79787687682.22667877787768768768767868668687688768778678668666688668768767687687687687678767668768768767867867678678678678667867666;	
	
		
		boolean isLike = true;
		
		System.out.println("I love charater :"+ character);	
		
		System.out.println("=================================================================================");	
		
		System.out.println("I am byte (1 byte) , I can store integer between -128 to 127 e.g. : " + value);
		System.out.println("I am short (2 byte) , I can store integer between -32768 to 32767 , e.g " + shortint);
		System.out.println("I am interger (4 byte) , I can store smallest interger as : " + integer);
		System.out.println("I am long interger (8 byte), can store largest interger as : " + longint );	
		
		System.out.println("=================================================================================");
		
		System.out.println("I am float (4 byte), used for values with decimal digits. e.g. :  " + floatDecimal);
		System.out.println("I am double (8 byte), used for values with decimal digits more precision . e.g. :  " + doubleDecimal);
		
		System.out.println("=================================================================================");
		
		System.out.println("I like JAVA : " + isLike);
		
		

	}

}
