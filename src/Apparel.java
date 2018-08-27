
public class Apparel extends Product{

	private char size;
	private String color;
	
	//Generating Getters and Setters

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//Creating a Constructor 
	
	public Apparel(String name, double price, int quantity) {
		super(name, price, quantity);
		
	}


	public Apparel(String name, double price, int quantity, char size , String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	
	
	
public void getDetails(){
	System.out.println("We sell different kinds of business clothes for both men and women");
}
	

}
