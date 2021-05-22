package day3hw;

public class Instructor extends User{
	
	//====================FIELD====================
	private int instructorNo;
	private String phoneNumber;
	
	//====================CONSTRUCTOR-PARAMETRELÝ====================	
	public Instructor(int id, String firstName, String lastName, String email, String password, int instructorNo,
			String phoneNumber) {
		super(id, firstName, lastName, email, password);
		this.instructorNo = instructorNo;
		this.phoneNumber = phoneNumber;
	}
	
	
	//====================OPERASYONLAR====================	
	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
