package Cap1;

import java.util.Scanner;

public class ex2_30 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int n1, n2, n3, n4, n5; // With only division
		int m2, m3, m4, m5; // With division and remainder
		
		System.out.print("Input a number of five digits: ");
		x = input.nextInt();
		
		n1 = x/10000;
		n2 = (x - (n1 * 10000)) / 1000;
		n3 = (x - (n1 * 10000) - (n2 * 1000)) / 100;
		n4 = (x - (n1 * 10000) - (n2 * 1000) - (n3 * 100)) / 10;
		n5 = (x - (n1 * 10000) - (n2 * 1000) - (n3 * 100) - (n4 * 10));
		
		m2 = (x % 10000) / 1000;
		m3 = ((x % 10000) - (m2 * 1000)) / 100;
		m4 = ((x % 10000) - (m2 * 1000) - (m3 * 100)) / 10;
		m5 = ((x % 10000) - (m2 * 1000) - (m3 * 100) - (m4 * 10));
		

		if(x > 99999)
			System.out.println("Number not valid, It's higher than 5 digits");
		if(x < 10000 && x != 00000)
			System.out.println("Number not valid, It's lesser than 5 digits");
		if(x > 10000 && x < 99999)
		{
			System.out.printf("With only division: %d   %d   %d   %d   %d%n", n1, n2, n3, n4, n5);
			System.out.printf("With division and remainder: %d   %d   %d   %d   %d", n1, m2, m3, m4, m5);
		}
		if(x == 00000)
		{
			System.out.printf("With only division: %d   %d   %d   %d   %d%n", n1, n2, n3, n4, n5);
			System.out.printf("With division and remainder: %d   %d   %d   %d   %d", n1, m2, m3, m4, m5);
		}
					
	}
}
