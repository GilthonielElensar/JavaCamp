package day2hw;

public class Main {

	public static void main(String[] args) {

		Course course1=new Course(1, "JAVA + REACT", "Engin Demiro�");
		Course course2=new Course(2, "C# + ANGULAR", "Engin Demiro�");
		Course course3=new Course(2, "Programlamaya Giri�", "Engin Demiro�");
		
		Course[] courses= {course1,course2, course3};  // Kurslar listelendi.
		
		System.out.println("<=== KURSLAR �LE �LG�L� ��LEMLER ===>"); 
		for(Course course:courses) {
			System.out.println(course.name);   //Dizi deki kurslar ekrana yazd�r�ld�
		}
		
		CourseManager courseManager=new CourseManager();  //course ile ilgili metotlar �al��t�r�ld�.
		 courseManager.add(course1);
		 courseManager.delete(course3);
		 
		 Category category1=new Category(10, "Temel Seviye");
		 Category category2=new Category(11, "Orta Seviye");
		 Category category3=new Category(12, "�leri Seviye");
		 
		 Category[] categories= {category1,category2, category3};
		 
		 System.out.println("                                         "); 
		 System.out.println("<=== KATEGOR�LER �LE �LG�L� ��LEMLER ===>");
		 for(Category category:categories) {
			 System.out.println(category.categoryName);  
		 }
		 
		 CategoryManager categoryManager=new CategoryManager();
		 categoryManager.add(category3);
		 categoryManager.add(category2);
		 categoryManager.update(category1);
	}

}
