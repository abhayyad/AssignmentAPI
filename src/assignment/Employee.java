package assignment;

public class Employee {

	int empId;
	int empAge;
	int empDeptId;

	public Employee(int empId, int empAge, int empDeptId) {

		this.empId = empId;
		this.empAge = empAge;
		this.empDeptId = empDeptId;

	}

	public Employee() {

	}

	public void displayEmployeeDetails() {
		
		System.out.println("Employee Id : "+ empId + " Employeee Age : " + empAge + " employee Dep id :" + empDeptId);
		
		
	}
	
}
