package Cap1;

import java.util.Scanner;

public class ex2_25 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		
		y = x%2;
		
		if(y == 0)
			System.out.printf("The integer %d is even.%n", y);
		if(y != 0)
			System.out.printf("The integer %d is odd.%n", y);
			
	}
}
