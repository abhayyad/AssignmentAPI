package assignment;

public class Assignment3_Calculator {

	public static void main(String[] args) {
		int integer1= 547979798;
		int integer2 = 7;
		
	//	long longint1 = 8778778987987897987l;
	//	long longint2 = 8778778987987897987l;		
		
		float floatNum1= 54.55775f;
		float floatNum2 = 7.89888909f;
		
	    double doubleNum1=677797788888.98989889;
	    double doubleNum2=179789888.9898098888778787887879889;
		
		
		System.out.println("============================Interger Calculator==================================================");
		System.out.println();
		System.out.println("The sum of integers " + integer1 + " and " + integer2 + " is = " + (integer1+integer2));
		System.out.println("The diffrence of integers " + integer1 + " and " + integer2 + " is = " + (integer1-integer2));
		System.out.println("The division of integers " + integer1 + " and " + integer2 + " is = " + (integer1/integer2));
		System.out.println("The modulo of integers " + integer1 + " and " + integer2 + " is = " + (integer1%integer2));
		System.out.println();
		System.out.println("========================Float Num Calculator =============================================================");
		System.out.println();
		System.out.println("The sum of float numbers " + floatNum1 + " and " + floatNum2 + " is = " + (floatNum1+floatNum2));
		System.out.println("The diffrence of float numbers " + floatNum1 + " and " + floatNum2 + " is = " + (floatNum1-floatNum2));
		System.out.println("The division of float numbers " + floatNum1 + " and " + floatNum2 + " is = " + (floatNum1/floatNum2));
		System.out.println("The modulo of float numbers " + floatNum1 + " and " + floatNum2 + " is = " + (floatNum1%floatNum2));
		System.out.println();
		System.out.println("===================Cross Data Type Calculation==============================================================");
		System.out.println();
		
		float SumFloatInt = floatNum1 + integer1;
		double SumdoubleInt = doubleNum1 + integer1;
		
		System.out.println("The sum of float number and interger  " + floatNum1 + " and " + integer1 + " is = " + (SumFloatInt));
		System.out.println("The sum of double number and interger " + doubleNum1 + " and " + integer1 + " is = " + (SumdoubleInt));
		System.out.println();
		System.out.println("**************************************************************************************************************************");
		System.out.println();
		
		System.out.println("The sum of double numbers  " + doubleNum1 + " and " + doubleNum2 + " is = " + (doubleNum1+doubleNum2));
	}

}
