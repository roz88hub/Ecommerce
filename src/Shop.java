// Creating a Shop class
import java.util.*;
public class Shop {
	public static void main(String[] args) {

		// Creating an Object from Person
		// FName: Tom,LNameInitial: H, Weight 152.5, Feet: 5, Inches: 6)
	 
	Product[] inventory= new Product [5];	 
	 
	 //Creating a object of an Array
	 //Product(String name,double price,String category, int quantity,char size, String color )
	 inventory[0] = new Product("Business Ritual Women’s Long Sleeve Top",65.39,"Apparel",4,'L',"Blue");
	 inventory[1] = new Product("The Art of Computer Programming",190.54,"Books",9, "Donald E. Knuth");
	 inventory[2] = new Product("Men’s Business Casual Shirt" ,57.10,"Apparel",2, 'M',"Teal");
	 inventory[3] = new Product("Organic Turmeric Soap" ,11.25, "Bath & Beauty",1);
	 inventory[4] = new Product("Head First Design Pattern",37.35,"Books",3,"Eric Freeman");
	
	
		Scanner inputKey = new Scanner(System.in);
		 double totalAmount = 0.0;	 
		 int userInput = 9;
	   	
	 while(true) {
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
		  if(userInput >= 0 && userInput <= 4) {
		  if(inventory[userInput].buy()) {
			  System.out.println("Your purchase was successful" + totalAmount);
			  totalAmount += inventory[userInput].getPrice();
			  	      
		      }
		      else {
		    	  System.out.println("Print the out of stock message" +totalAmount);
		      }
		  }
		  else {
			//User entered a number other than 0,1,2,3,4
			  System.out.println("“Thank you for shopping with us! The total amount is : " + totalAmount);
		    break;
		  }
		}
	 //Closing Scanner input
	 	inputKey.close(); 
}
	

}

