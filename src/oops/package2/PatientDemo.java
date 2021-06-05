package oops.package2;

public class PatientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*private String name;
	private int age;
	private String diagnosis;
	private boolean admittedStatus;
	private static int noOfPatients;;
	private int roomNo;
	private String doctorAssigned;
		*/
		
		Patient p1 = new AdmittedPatients();
		p1.getPatientDetails();
		System.out.println(Patient.noOfPatients);
		Patient p2 = new AdmittedPatients("Abhay",25,"eye",true,101,"GUPTA");
		p2.getPatientDetails();
		System.out.println(Patient.noOfPatients);
		
		Patient p3 = new Patient();
		p3.getPatientDetails();
		System.out.println(Patient.noOfPatients);
		Patient p4 = new Patient("Ashu",25,"Blood",false);
		p4.getPatientDetails();
		System.out.println(Patient.noOfPatients);
		
		p2.dischargePatient();
		
		System.out.println("Count of patient after first dischanrge "+Patient.noOfPatients);
		p4.dischargePatient();
		
		System.out.println("Count of patient after second dischanrge " +Patient.noOfPatients);
		
		p2.getPatientDetails();
		p4.getPatientDetails();
		
	}

}
