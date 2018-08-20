// Creating a Shop class
import java.util.*;

public class Shop {
	
	private static boolean isShopOpen = true;
	static Product [] inventory = {new Product("Business Ritual Women’s Long Sleeve Top",65.39,"Apparel",4,'L',"Blue"),
						new Product("The Art of Computer Programming",190.54,"Books",9, "Donald E. Knuth"),
						new Product("Men’s Business Casual Shirt" ,57.10,"Apparel",2, 'M',"Teal"),
						new Product("Organic Turmeric Soap" ,11.25, "Bath & Beauty",1),
						new Product("Head First Design Pattern",37.35,"Books",3,"Eric Freeman")};				
	
		
	static double totalAmount = 0.0;	 
	static int userInput = 9;
	
	public static void main(String[] args) {

		// Creating an Object from Person
		// FName: Tom,LNameInitial: H, Weight 152.5, Feet: 5, Inches: 6)

		/*Product[] shop.inventory= new Product [5];	 

		//Creating a object of an Array
		//Product(String name,double price,String category, int quantity,char size, String color )
		shop.inventory[0] = new Product("Business Ritual Women’s Long Sleeve Top",65.39,"Apparel",4,'L',"Blue");
		shop.inventory[1] = new Product("The Art of Computer Programming",190.54,"Books",9, "Donald E. Knuth");
		shop.inventory[2] = new Product("Men’s Business Casual Shirt" ,57.10,"Apparel",2, 'M',"Teal");
		shop.inventory[3] = new Product("Organic Turmeric Soap" ,11.25, "Bath & Beauty",1);
		shop.inventory[4] = new Product("Head First Design Pattern",37.35,"Books",3,"Eric Freeman");*/

		if (!isShopOpen){
			System.out.println("Shop is close");
		}
		else{

			Scanner inputKey = new Scanner(System.in);

			while(true && isShopOpen) {
				System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
				for ( int i = 0; i < inventory.length ; i++) {
					System.out.println(i + ":" + inventory[i].getName());
				}
				try {			  
					System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
					userInput = inputKey.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Invalid input, exiting the shopping cart! Your total amount is " + totalAmount);
					break;
				}
				
				
				try{
				
					if(userInput != 0 && userInput >= 4) {
					if(inventory[userInput].buy()) {
						System.out.println("Your purchase was successful" + totalAmount);
						totalAmount += inventory[userInput].getPrice();
					}
					}
				}

					
					/*else {
						System.out.println("Print the out of stock message" +totalAmount);
					}*/
				
				catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Out of stock message " + " Total: " + totalAmount);
					
				}				
			}
			
			//Closing Scanner input
			inputKey.close(); 
		}
	}

}

