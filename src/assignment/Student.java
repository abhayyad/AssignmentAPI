package assignment;

import java.util.Scanner;

public class Student {
	
	String name;
	int age;
	double marks;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);			
		Student s1 = new Student();
		Student s2 = new Student(); 
			
			
		userInput(s1, scan);		
		userInput(s2, scan);
		
		
		System.out.println("Name Of S1 is " + s1.name +"\n" + "Age of S1 is " + s1.age + "\n" + "Marks of S1 is " + s1.marks);
		System.out.println("Name Of S2 is " + s2.name +"\n" + "Age of S2 is " + s2.age + "\n" + "Marks of S2 is " + s2.marks);
		scan.close();
		
		
		
			}

		public static void userInput(Student s, Scanner scan) {
		System.out.println("Enter the name : ");		
		s.name = scan.next();
		
		System.out.println("Enter the Age  : ");		
		s.age = scan.nextInt();
		
		System.out.println("Enter the Marks  : ");		
		s.marks = scan.nextDouble();
		
			}
		
}



