package day3hw;

public class User {
	 //====================FIELD====================
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	 //====================CONSTRUCTOR-PARAMETRELÝ====================	
	public User(int id, String firstName, String lastName, String email, String password) {
	System.out.println("Parametreli constructor çalýþtý");
	//super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
}
	//====================CONSTRUCTOR-PARAMETRESÝZ====================	
	public User() {
		//System.out.println("Parametresiz constructor çalýþtý");
	}

	//====================OPERASYONLAR====================	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
