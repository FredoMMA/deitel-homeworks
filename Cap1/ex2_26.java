package Cap1;

import java.util.Scanner;

public class ex2_26 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, y;
		
		System.out.print("Insert the first integer: ");
		x = input.nextInt();
		
		System.out.print("Insert the second integer: ");
		y = input.nextInt();
		
		if((x%y) == 0)
			System.out.printf("The integer %d is multiple of %d.%n", x, y);
		if((x%y) != 0)
			System.out.printf("The integer %d is not multiple of %d.%n", x, y);
		
	}
}
