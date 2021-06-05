package assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDirectory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Employees> emplist = new LinkedList<Employees>();
		Employees e = new Employees();
		EmpDirectorymenu(scan, emplist, e);

		scan.close();

	}

	private static void EmpDirectorymenu(Scanner scan, List<Employees> emplist, Employees e) {

		System.out.println("***********Employee Directory Menu**********");
		System.out.println("1. Add Employee ");
		System.out.println("2. Search Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Display All Employee");
		System.out.println("5. Exit");

		System.out.println("Enter your choice : ");
		EmpMenuAction(scan, emplist, e);

	}

	private static void EmpMenuAction(Scanner scan, List<Employees> emplist, Employees e) {

		int UserSelection = scan.nextInt();

		while (UserSelection > 5 || UserSelection < 1) {
			System.out.println("Wrong Input !!!!!! select options from menu ");
			System.out.println("Enter your choice : ");
			UserSelection = scan.nextInt();
		}

		switch (UserSelection) {

		case 1:
			EmployeeAddition(scan, emplist, e);
			EmpDirectorymenu(scan, emplist, e);
			break;
		case 2:
			EmployeeSearch(scan, emplist);
			EmpDirectorymenu(scan, emplist, e);
			break;
		case 3:
			EmployeeDeletion(scan, emplist);
			EmpDirectorymenu(scan, emplist, e);
			break;
		case 4:
			EmployeeAllDisplay(scan, emplist);
			EmpDirectorymenu(scan, emplist, e);
			break;
		case 5:
			Exit();
			break;
		}

	}

	private static void EmployeeAddition(Scanner scan, List<Employees> emplist, Employees e) {

		int empNo;
		String empName;
		String empAddress;
		String empGender;
		int empAge;

		System.out.println("Enter the Employee Number : ");
		empNo = scan.nextInt();
		System.out.println("Enter the Employee Name : ");
		empName = scan.next();
		System.out.println("Enter the Employee Address : ");
		empAddress = scan.next();
		System.out.println("Enter the Employee Gender : ");
		empGender = scan.next();
		System.out.println("Enter the Employee Age : ");
		empAge = scan.nextInt();

		e = new Employees(empNo, empName, empAddress, empGender, empAge);
		emplist.add(e);

	}

	private static void EmployeeAllDisplay(Scanner scan, List<Employees> emplist) {
		
		System.out.println("******************Employee List***************"+"\n");	
		
		System.out.println("[EmpNo,EmpName,EmpAddress,EmpGender,EmpAge]");

		for (int i = 0; i < emplist.size(); i++) {
		
		System.out.println("["+emplist.get(i).empNo + "," + emplist.get(i).empName + "," + emplist.get(i).empAddress + ","
				+ emplist.get(i).empGender + "," + emplist.get(i).empAge+"]");
		}

	}

	private static void EmployeeSearch(Scanner scan, List<Employees> emplist) {
		
		System.out.println("Enter the Employee No. : ");
		int empNo = scan.nextInt();
		for (int i = 0; i < emplist.size(); i++) {
			
			if(emplist.get(i).empNo == empNo )
			{	
			System.out.println("*********Employee Details**********");
			System.out.println("[EmpNo,EmpName,EmpAddress,EmpGender,EmpAge]");	
			System.out.println("["+emplist.get(i).empNo + "," + emplist.get(i).empName + "," + emplist.get(i).empAddress + ","
					+ emplist.get(i).empGender + "," + emplist.get(i).empAge+"]");
			}			
			
			}	

	}

	private static void Exit() {

		System.out.println("Thank You !!!");

	}

	private static void EmployeeDeletion(Scanner scan, List<Employees> emplist) {
		System.out.println("Enter the Employee No. : ");
		int empNo = scan.nextInt();
		for (int i = 0; i < emplist.size(); i++) {
			
			if(emplist.get(i).empNo == empNo )
			{	
			 emplist.remove(i);
			}			
			
			}
	}

}
