/* ex2_17.java
 * (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
 * user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
 * shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
 * representation of the average. So, if the sum of the values is 7, the average should be 2, not
 * 2.3333….]
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/02/2015
 * Hour: 23:00
 */
package Cap1;

import java.util.Scanner;

public class ex2_17 
{
	//main method Java application
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int sum;
		int average;
		int product;
		int smallest;
		int largest;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		sum = x + y + z;
		System.out.printf("The sum is %d.%n", sum);
		
		product = x * y * z;
		System.out.printf("The product is %d.%n", product);
		
		average = sum / 3;
		System.out.printf("The average is %d.%n", average);
		
		if(x > y && x > z)
		{
			System.out.printf("%d is the largest integer.%n", x);
		}
		
		if(y > x && y > z)
		{
			System.out.printf("%d is the largest integer.%n", y);
		}
		
		if(z > x && z > y)
		{
			System.out.printf("%d is the largest integer.%n", z);
		}
		
		if(x < y && x < z)
		{
			System.out.printf("%d is the smallest integer.%n", x);
		}
		
		if(y < x && y < z)
		{
			System.out.printf("%d is the smallest integer.%n", y);
		}
		
		if(z < x && z < y)
		{
			System.out.printf("%d is the smallest integer.%n", z);
		}
	}
}
