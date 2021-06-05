package oops.package2;

public class AdmittedPatients extends Patient {

	private int roomNo;
	private String doctorAssigned;

	public AdmittedPatients(String name, int age, String diagnosis, boolean admittedStatus, int roomNo,
			String doctorAssigned) {
		super(name, age, diagnosis, admittedStatus);
		this.roomNo = roomNo;
		this.doctorAssigned = doctorAssigned;
	}

	public AdmittedPatients() {
		super();
	}

	@Override
	public void getPatientDetails() {
		System.out.println("Name :  " + super.getName() + " Age : " + super.getAge() + " Diagonistic :"
				+ super.getDiagnosis() + "  Admitted state :  " + super.isAdmittedStatus() + "  Room : " + this.roomNo
				+ "  Doctor assighed : " + this.doctorAssigned);

	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getDoctorAssigned() {
		return doctorAssigned;
	}

	public void setDoctorAssigned(String doctorAssigned) {
		this.doctorAssigned = doctorAssigned;
	}

}
