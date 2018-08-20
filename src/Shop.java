import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class Shop {
	static boolean isShopOpen = true;
	public static void main(String[] args) {
		Product[] inventory = new Product[5];
		inventory[0] = new  Product("Business Ritual Women’s Long Sleeve Top",65.39,"Apparel",4,'L',"Blue");
		inventory[1] = new  Product("The Art of Computer Programming",190.54,"Books",9,"Donald E. Knuth");
		inventory[2] = new  Product("Men’s Business Casual Shirt",57.10,"Apparel",2,'M',"Teal");
		inventory[3] = new  Product("Organic Turmeric Soap",11.25,"Bath & Beauty",1);
		inventory[4] = new  Product("Head First Design Pattern",37.35,"Books",3,"Eric Freeman");

		double totalAmount = 0.0;
		int userInput=9;
		Date d = new Date();
		Scanner Keyboard = new Scanner(System.in);

		if (d.getHours() >= 21){
			isShopOpen = false;
		}
		
		if(!isShopOpen) {
			System.out.println("Shop is close");
		}
		else{
			while(true){
				System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");

				for(int i =0;i<inventory.length;i++){
					System.out.println(i + " : " + inventory[i].getName()); 
				}

				try{
					userInput = Keyboard.nextInt();
				}
				catch(InputMismatchException e){
					System.out.println( "Invalid input, exiting the shopping cart! Your total amount is " + totalAmount + "\n");
					break;
				}
				if(userInput>=0 && userInput<5){
					if(inventory[userInput].buy()){
						System.out.println("Your purchase was succesful");
						totalAmount += inventory[userInput].getPrice();
					}

					else 
						System.out.println("The item is out of stock"); }
				else
				{
					System.out.println("Thank you for shopping with us! The total amount is "  +  totalAmount + "\n");
					break;
				}

			}


			//Extra Credit   Use for-each loop to print the products inside inventory. 
			for(Product product: inventory){
				System.out.println(product);
			}

			Keyboard.close();
		}



	}
}