/*Rojan Pradhan
Quiz 5*/

//Creating a Product Class
public abstract class Product {
	String name;

	//Setting a getter and Setters for attributes of Class Product
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	/*public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}*/
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}*/
	double price;	
	int quantity;
	/*String category;
	char size;  
	String author;
	String color;*/

	//Creating Constuctor for name, price and quantity

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}


	//Creating a Constructor

	/*Product(String name,double price,String category, int quantity,char size, String color  ){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.size = size;
	this.color = color;

}

Product(String name,double price,String category, int quantity, String author){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
	this.author = author;

}
Product(String name,double price,String category, int quantity){
	this.name = name;
	this.price = price;
	this.category = category;
	this.quantity = quantity;
}*/
	//Creating a toString Method
	/*@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", category="
			+ category + ", quantity=" + quantity + ", size=" + size
			+ ", author=" + author + ", color=" + color + "]";
}*/


	// Creating instand method buy()
	public boolean buy(){
		if(this.quantity > 0 ){
			this.quantity--;
			return true;
		}else{
			return false;
		}
	}

	//Creating an abstract method
	public void getDetails() {
		System.out.println("We sell books that’ll make you smarter at programming");
	}


}
