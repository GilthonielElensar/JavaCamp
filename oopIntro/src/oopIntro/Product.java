package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.id=id;               //bu sat�rla bu calss'taki alanlar� constructor'daki alanlara e�itliyoruz.
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
