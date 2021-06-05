package assignment;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

	public static void main(String[] args) {

		List<Integer> register1 = new ArrayList<Integer>();
		register1.add(10);
		register1.add(20);
		register1.add(30);
		register1.add(40);
		register1.add(50);
		register1.add(10);
		List<Integer> register2 = new ArrayList<>(); // ok
		register2.add(30);
		register2.add(40);
		register2.add(50);
		register2.add(20);
		register2.add(10);
		register2.add(60);
		List register3 = new ArrayList(); // ok 
		

		// printIntegerArrayList(register1);
		// displayArrayList(register1);

		// printIntegerArrayList(register2);
		// displayArrayList(register2);

		int unMatchedCounter = 0;
		int arraylistDataNotexist1 = 0;
		int arraylistDataNotexist2 = 0;
		
		for (int value1 : register1) {

			for (int value2 : register2) {
				if (value1 != value2) {
					unMatchedCounter++;
				}
			}

			if (unMatchedCounter == register2.size()) {

				arraylistDataNotexist1++;
			}
			unMatchedCounter = 0;
		}

		for (int value2 : register2) {

			for (int value1 : register1) {
				if (value2 != value1) {
					unMatchedCounter++;
				}
			}

			if (unMatchedCounter == register1.size()) {
				arraylistDataNotexist2++;
			}
			unMatchedCounter = 0;
		}

		if (arraylistDataNotexist1 > 0 || arraylistDataNotexist2 > 0) {
			System.out.println("Array lists are not equal " + "\n" + register1 + "\n" + register2);
		} else {
			System.out.println("Array lists are equal " + "\n" + register1 + "\n" + register2);
		}
	}

	/*
	 * private static void displayArrayList(List<Integer> register) {
	 * System.out.println(register); }
	 * 
	 * private static void printIntegerArrayList(List<Integer> register) { for (int
	 * value : register) { System.out.print(value + " "); } System.out.println("");
	 * }
	 */

}
