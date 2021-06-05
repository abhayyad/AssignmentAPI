package oops.package2;

public class Patient {
		
	/*name  (String)
	- age (int)
	- diagnosis (String)
	- admittedStatus (boolean) - true if patient is still in hospital, 
	  and false when patient gets discharged method is called
	- no Of patients to be stored at class level (static variable)
*/
	
	private String name;
	private int age;
	private String diagnosis;
	private boolean admittedStatus;
	static int noOfPatients;
	
	
	
	public Patient(String name, int age, String diagnosis, boolean admittedStatus) {
		this.name = name;
		this.age = age;
		this.diagnosis = diagnosis;
		this.admittedStatus = admittedStatus;
		noOfPatients ++;
	}
	
	public Patient(){
		this.diagnosis = "Pre-check";
		this.admittedStatus = false;
		noOfPatients ++;
	}
	
	public void getPatientDetails() {
		
		System.out.println("Name :  "+ this.name + " Age : " + this.age+ " Diagonistic :" + this.diagnosis + "  Admitted status: " + this.admittedStatus );
		
	}
	
	public void dischargePatient() {
		
		this.admittedStatus = false;
		--noOfPatients;		
		
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public boolean isAdmittedStatus() {
		return admittedStatus;
	}
	public void setAdmittedStatus(boolean admittedStatus) {
		this.admittedStatus = admittedStatus;
	}
	
	 

}
