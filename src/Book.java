
public class Book extends Product {

	private String author;
	private String genre;
	private String isbn;
	
	
	
	//Getters and Settters for the Attributes
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	//Creating Constructor
	public Book(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
	

	


	public Book(String name, double price, int quantity, String author ) {
		super(name, price, quantity);
		this.author = author;
		// TODO Auto-generated constructor stub
	}
	
	

	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	@Override
	public void getDetails() {
		
	}
	

}
