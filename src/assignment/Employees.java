package assignment;

public class Employees {
	
	int empNo;
	String empName;
	String empAddress;
	String empGender;
	int empAge;
	
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public Employees(int empNo, String empName, String empAddress, String empGender, int empAge) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empGender = empGender;
		this.empAge = empAge;
	}

	public Employees() {
		
	}
	public void displayObjectDetails() {
	
		System.out.println(" "+empNo+" "+empName+" "+empAddress+" "+empGender+" "+empAge);
		
	}
		

}
