package Cap6;

import java.util.Scanner;

public class Ex6_9RoundingNumbers {

	public static void main(String[] args) {
		
		double x;
		int y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Rounding Number");
		System.out.print("Insert the value to be rounded with floor: ");
		x = input.nextDouble();
		
		y = (int) Math.floor(x + 0.5);
		
		System.out.printf("%s%f%n%s%d%n",
				"The original value: ",
				x, 
				"The rounded value: ",
				y);
		
	}
}
