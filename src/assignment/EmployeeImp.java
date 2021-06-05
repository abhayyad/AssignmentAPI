package assignment;

public class EmployeeImp {

	public static void main(String[] args) {
		
		Employee e1  = new Employee(1,23,100);
		Employee e2  = new Employee(2,24,200);
		Employee e3  = new Employee(3,34,700);
		Employee e4  = new Employee(4,45,800);
		Employee e5  = new Employee(5,87,900);
		
		Manager m1 = new Manager(6,34,300,201,'T');
		Manager m2 = new Manager(7,35,300,202,'T');
		Manager m3 = new Manager(8,36,300,203,'C');
		Manager m4 = new Manager(9,37,300,204,'C');
		Manager m5 = new Manager(10,38,300,205,'R');
		
		Employee e6 = new Manager(11,38,300,205,'R');
		
		// not allowed 
		//Manager m6 = new Employee(12,87,900);
		
		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
		e3.displayEmployeeDetails();
		e4.displayEmployeeDetails();
		e5.displayEmployeeDetails();
		
		m1.displayEmployeeDetails();
		m2.displayEmployeeDetails();
		m3.displayEmployeeDetails();
		m4.displayEmployeeDetails();
		m5.displayEmployeeDetails();
		
		e6.displayEmployeeDetails();
		
	}

}


