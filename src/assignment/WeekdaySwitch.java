package assignment;

import java.util.Scanner;

public class WeekdaySwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter day of the week : ");
		int day = scan.nextInt();
		
		scan.close();
		
		switch(day) {
		
		default:
			System.out.println("Oops ....Not a right entry ");	
			// break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("This is a weekday");
			break;
		case 6:
		case 7:
			System.out.println("This is a weekend");
			break;	
		
		}

	}

}
