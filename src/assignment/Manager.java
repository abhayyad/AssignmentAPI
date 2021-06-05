package assignment;

public class Manager extends Employee {

	int managerid;
	char managementArea;

	public Manager(int empId, int empAge, int empDeptId, int managerid, char managementArea) {
		super(empId,empAge,empDeptId);
		this.managerid = managerid;
		this.managementArea = managementArea;

	}

	public void displayEmployeeDetails() {

		System.out.println("Employee Id:  " + empId + " Employeee Age : " + empAge + 
				" employee Dep id : " + empDeptId	+ " Manager Id : " + 
				managerid + " Management Area : " + managementArea);

	}

}
