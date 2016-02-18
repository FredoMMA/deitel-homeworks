package Cap6;

import java.util.Scanner;

public class Ex6_32DistanceBetweenPoints {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("DISTANCE BETWEEN POINTS");
		System.out.print("Enter the x-coordinate of the first point: ");
		double x1 = input.nextDouble();
		
		System.out.print("Enter the y-coordinate of the first point: ");
		double y1 = input.nextDouble();
		
		System.out.print("Enter the x-coordinate of the second point: ");
		double x2 = input.nextDouble();
		
		System.out.print("Enter the y-coordinate of the second point: ");
		double y2 = input.nextDouble();
		
		double d = distance(x1, y1, x2, y2);
		
		System.out.printf("The distance between the first point (%.2f, %.2f) "
				+ "and second point (%.2f, %.2f) is: %.2f", x1, y1, x2, y2, d);
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		
		double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		return d;
	}
}
