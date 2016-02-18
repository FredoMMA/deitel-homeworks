/*ex2_16
 * (Comparing Integers) Write an application that asks the user to enter two integers, obtains
 * them from the user and displays the larger number followed by the words "is larger". If the numbers
 * are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
 * Author: Carlos Humberto de Paula Borges
 * Date: 09/02/2015
 */
package Cap1;
import java.util.Scanner; //program uses class Scanner.

public class ex2_16 
{
	// main method Java application
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		if(x > y)
		{
			System.out.printf("%d is larger", x);
		}
		
		if(y > x)
		{
			System.out.printf("%d is larger", y);
		}
		
		if(x == y)
		{
			System.out.println("These numbers are equal.");
		}
		
	}
}
