package assignment;

import java.util.Scanner;

public class UserCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first Number1 : ");
		int integer1 = scan.nextInt();
		
		System.out.println("Enter the first Number2 : ");
		int integer2 = scan.nextInt();
		
		scan.close();
		
		System.out.println("============================ Calculation Results==================================================");
		System.out.println();
		System.out.println("The sum of integers " + integer1 + " and " + integer2 + " is = " + (integer1+integer2));
		System.out.println("The diffrence of integers " + integer1 + " and " + integer2 + " is = " + (integer1-integer2));
		System.out.println("The product of integers " + integer1 + " and " + integer2 + " is = " + (integer1*integer2));
		System.out.println("The division of integers " + integer1 + " and " + integer2 + " is = " + (integer1/integer2));
		System.out.println("The modulo of integers " + integer1 + " and " + integer2 + " is = " + (integer1%integer2));
		System.out.println();

	}

}
