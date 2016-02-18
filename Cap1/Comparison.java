/*Coomparison.java
 * Compare integers using if statements, relational operators
 * and equality operators.
 * Name: Carlos Humberto de Paula Borges
 * Date: 09/02/2015
 * Hour: 02:09
 */
package Cap1;
import java.util.Scanner; //program uses class Scanner

public class Comparison 
{
	//main method begins Java application
	public static void main(String[] args)
	{
		//create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1; //first number to compare
		int number2; // second number to compare
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		if(number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if(number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		
		if(number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if(number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
		
		if(number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
	}//end method main
}//end class Comparison
