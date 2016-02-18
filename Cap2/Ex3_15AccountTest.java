package Cap2;

import java.util.Scanner;

public class Ex3_15AccountTest 
{
	public static void main(String[] args)
	{
		Ex3_15Account account1 = new Ex3_15Account("Jane Green", 50.00);
		Ex3_15Account account2 = new Ex3_15Account("John Blue", -7.53);
		
		Scanner input = new Scanner(System.in);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter the deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		displayAccount(account1);
		
		System.out.print("Enter the deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		displayAccount(account2);
		
	}
	
	public static void displayAccount(Ex3_15Account accountToDisplay)
	{
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
