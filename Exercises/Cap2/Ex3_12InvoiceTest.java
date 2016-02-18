package Cap2;

import java.util.Scanner;

public class Ex3_12InvoiceTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Ex3_12Invoice item1 = new Ex3_12Invoice("A0123", "A test item.", 10, 20.00);
		Ex3_12Invoice item2 = new Ex3_12Invoice("A4567", "A test item 2.", -1, 50.00);
		Ex3_12Invoice item3 = new Ex3_12Invoice("A89", "A test item 3.", 30, -50.00);
		
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n", item1.getNumber(), item1.getQuantity(), item1.getPrice(), item1.getDescription());
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n", item2.getNumber(), item2.getQuantity(), item2.getPrice(), item2.getDescription());
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n%n", item3.getNumber(), item3.getQuantity(), item3.getPrice(), item3.getDescription());
		
		System.out.printf("Set a new number for item %s:%n", item1.getNumber());
		String number = input.nextLine();
		item1.setNumber(number);
		System.out.printf("%nSet a new description for item %s: %n", item1.getNumber());
		String description = input.nextLine();
		item1.setDescription(description);
		System.out.printf("%nSet a new quantity for item %s: %n", item2.getNumber());
		int quantity = input.nextInt();
		item2.setQuantity(quantity);
		System.out.printf("%nSet a new price for item %s: %n", item3.getNumber());
		double price = input.nextDouble();
		item3.setPrice(price);
		
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n", item1.getNumber(), item1.getQuantity(), item1.getPrice(), item1.getDescription());
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n", item2.getNumber(), item2.getQuantity(), item2.getPrice(), item2.getDescription());
		System.out.printf("The item %s has a quantity of %d with the price of %.2f $R. %nDescription: %s%n%n", item3.getNumber(), item3.getQuantity(), item3.getPrice(), item3.getDescription());
		
		System.out.printf("The invoice amount of item %s is %.2f%n", item1.getNumber(), item1.getInvoiceAmount());
		System.out.printf("The invoice amount of item %s is %.2f%n", item2.getNumber(), item2.getInvoiceAmount());
		System.out.printf("The invoice amount of item %s is %.2f%n", item3.getNumber(), item3.getInvoiceAmount());
	}
}
