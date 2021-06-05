package assignment;

import java.util.Scanner;

public class MenuDrivenCalculator2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		calculatorMenu();		
		int selectAction = scan.nextInt();
		while (selectAction >5 || selectAction < 1) {
			System.out.println(" Oops ! Not a right operation entry ! " + "\n"+ "Please select entry from the menu: ");
			selectAction = scan.nextInt();
		}
		getOperand1();
		int operand1 = scan.nextInt();
		getOperand2();
		int operand2 = scan.nextInt();
		operation(selectAction,operand1,operand2);		
		scan.close();	
		

	}

	private static void getOperand2() {
		System.out.println("Enter the second Number : ");
	}

	private static void getOperand1() {
			System.out.println("Enter the first Number : ");
	}

	private static void operation(int selectAction, int inputNum1, int inputNum2) {
		
		switch(selectAction) {

		default:
			System.out.println("Oops ....Not a right operation entry, please select entry from the menu ");	
			break;
		case 1:		
			int sum = addition(inputNum1,inputNum2);				
			System.out.println("The Sum of "+ inputNum1 +" and " + inputNum2 + " is : " + sum);
			break;
		case 2:
			int diff = substraction(inputNum1,inputNum2);	
			System.out.println("The difference between "+ inputNum1 +" and " + inputNum2 + " is : " + diff);
			break;
		case 3:
			int product = multiplication(inputNum1,inputNum2);	
			System.out.println("The product of "+ inputNum1 +" and " + inputNum2 + " is : " + product);
			break;
		case 4:
			double div = division(inputNum1,inputNum2);			
			System.out.println(inputNum1 +" divided by " + inputNum2 + " is equal to: " + div);
			break;
		case 5:
			int mod = modulus(inputNum1,inputNum2);				
			System.out.println(inputNum1 +" mod " + inputNum2 + " is equal to: " + mod);
			break;
			
		}
	}

	private static void calculatorMenu() {
		System.out.println("================Menu===============");
		System.out.println(" For Addition, enter 1 : ");
		System.out.println(" For Substraction , enter 2 : ");
		System.out.println(" For Multiplication , enter 3 : ");
		System.out.println(" For Division , eneter 4 : ");
		System.out.println(" For Mod , enter 5 : ");
		System.out.println("===================================");
		System.out.println("                                   ");
		System.out.println(" Select the operation : ");
	}


/*	public static int getOperationinput() {
		Scanner scan = new Scanner(System.in);	
		int selectAction = scan.nextInt();	
		return selectAction;		
	}
	
	
	public static int getInput1() {
		System.out.println("Enter the first Number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		return input;
	}
	public static int getInput2() {
		System.out.println("Enter the second Number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();		
		return input;
	}   */

	public static int addition(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}


	public static int modulus(int num1, int num2) {
		int mod = num1 % num2;
		return mod;
	}

	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	public static int multiplication(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}

	public static int substraction(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}


}
