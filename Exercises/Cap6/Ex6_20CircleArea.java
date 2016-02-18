package Cap6;

import java.util.Scanner;

public class Ex6_20CircleArea {

	public static void main(String[] args) {
		
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		area = circleArea(radius);
		
		System.out.printf("The area of the circle with radius %f is: %f", radius, area);
	}
	
	public static double circleArea(double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
}
