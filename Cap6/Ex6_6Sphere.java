package Cap6;

import java.util.Scanner;

public class Ex6_6Sphere {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The volume of the sphere");
		System.out.print("Insert the radius of the sphere: ");
		double radius = input.nextDouble();
		
		double volume = sphereVolume(radius);
		
		System.out.printf("The volume of the sphere is %f", volume);
	} // end main
	
	public static double sphereVolume(double radius) {
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	} // end method 
} // end class sphereVolume
