package Cap2;

import java.util.Scanner;

public class Ex3_11AccountTest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Ex3_11 account1 = new Ex3_11("Carlos", 50.00);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		
		System.out.print("Enter the withdraw amount: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
	}
}
