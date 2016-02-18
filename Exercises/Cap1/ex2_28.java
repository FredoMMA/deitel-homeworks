package Cap1;

import java.util.Scanner;

public class ex2_28 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int r;
		
		System.out.print("Insert the radius of a circle: ");
		r = input.nextInt();
		
		System.out.printf("The diameter is %d.%n", 2 * r);
		
		System.out.printf("The circumference is %f.%n", 2 * (Math.PI) * r);
		
		System.out.printf("The area is %f.%n", (Math.PI) * r * r);
		
	}
}
