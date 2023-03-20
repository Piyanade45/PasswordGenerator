package HospitalManagement;

public class AllMethods {
	private int doctorId;
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpl;
    private int doctorExp;
    private int doctorAge;
    
	public AllMethods(int doctorId, String doctorFirstName, String doctorLastName, String doctorSpl, int doctorExp,
			int doctorAge) {
		super();
		this.doctorId = doctorId;
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorSpl = doctorSpl;
		this.doctorExp = doctorExp;
		this.doctorAge = doctorAge;
	}

	public AllMethods(String doctorFirstName, String doctorLastName, String doctorSpl, int doctorExp, int doctorAge) {
		super();
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorSpl = doctorSpl;
		this.doctorExp = doctorExp;
		this.doctorAge = doctorAge;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorSpl() {
		return doctorSpl;
	}

	public void setDoctorSpl(String doctorSpl) {
		this.doctorSpl = doctorSpl;
	}

	public int getDoctorExp() {
		return doctorExp;
	}

	public void setDoctorExp(int doctorExp) {
		this.doctorExp = doctorExp;
	}

	public int getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}

	@Override
	public String toString() {
		return "AllMethods [doctorId=" + doctorId + ", doctorFirstName=" + doctorFirstName + ", doctorLastName="
				+ doctorLastName + ", doctorSpl=" + doctorSpl + ", doctorExp=" + doctorExp + ", doctorAge=" + doctorAge
				+ "]";
	}   
}


    
