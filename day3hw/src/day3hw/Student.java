package day3hw;

public class Student extends User{
	//====================FIELD====================
	private int studentNo;

	 //====================CONSTRUCTOR-PARAMETRELÝ====================	
	public Student(int id, String firstName, String lastName, String email, String password, int studentNo) {
		//super(id, firstName, lastName, email, password);
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
		this.studentNo = studentNo;
	}

	//====================OPERASYONLAR====================	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

}
