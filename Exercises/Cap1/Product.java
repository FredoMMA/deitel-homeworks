/* Product.java  Ex.2.5
 * Calculate the product of three integers.
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/02/2015
 * Hour: 13:08
 */
package Cap1;
import java.util.Scanner;

public class Product 
{
	//main method of Java application
	public static void main(String[] args)
	{
		//create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Enter the first integer: "); //prompt for input
		x = input.nextInt(); //inserting the input integer to x
		
		System.out.print("Enter the second integer: "); //prompt for input
		y = input.nextInt(); //inserting the input integer to y
		
		System.out.print("Enter the third integer: "); //prompt for input
		z = input.nextInt(); //inserting the input integer to z
		
		result = x * y * z; //product of the three integers
		
		System.out.printf("The result is %d.%n", result);
	}//end method main
}//end class Product
