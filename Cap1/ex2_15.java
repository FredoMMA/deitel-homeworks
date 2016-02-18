/* ex2_15.java
 * (Arithmetic) Write an application that asks the user to enter two integers, obtains them
 * from the user and prints their sum, product, difference and quotient (division). Use the techniques
 * shown in Fig. 2.7.
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/02/2015
 * Hour: 20:17
 */

package Cap1;

import java.util.Scanner;

public class ex2_15 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.printf("The sum is %d.%n", sum);
		
		product = x * y;
		System.out.printf("The product is %d.%n", product);
		
		difference = x - y;
		System.out.printf("The difference is %d.%n", difference);
		
		quotient = x / y;
		System.out.printf("The quotient is %d.%n", quotient);
		
	}
}
