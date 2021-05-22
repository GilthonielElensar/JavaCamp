package day3hw;

public class Main {

	public static void main(String[] args) {
		
		Student student= new Student(1, "alev", "arslan","alevkalen@gmail.com","@l3v",424);
		System.out.println("Öğrenci: " + student.getFirstName()+ " " +student.getLastName());
		
		Instructor instructor=new Instructor(10,"Mehmet", "arslan","mehmet@gmail.com","m3hm3t", 100, "0534-370-66020");
		System.out.println("Öğretmen: " + instructor.getFirstName() +" " + instructor.getLastName());
		
		UserManager userManager= new UserManager();
		userManager.addUser(instructor);
		userManager.deleteUser(student);
		
		
		
		
		

	}

}
