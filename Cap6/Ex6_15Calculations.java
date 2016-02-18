package Cap6;

public class Ex6_15Calculations {

	public static void main(String[] args) {
		
		double side1 = 3.0;
		double side2 = 4.0;
		
		double result = hypotenuse(side1, side2);
		
		System.out.printf("The hypotenuse of the first triangle is: %f%n", result);
		
		side1 = 5.0;
		side2 = 12.0;
		
		result = hypotenuse(side1, side2);
		
		System.out.printf("The hypotenuse of the second triangle is: %f%n", result);
		
		side1 = 8.0;
		side2 = 15.0;
		
		result = hypotenuse(side1, side2);
		
		System.out.printf("The hypotenuse of the third triangle is: %f%n", result);
		
	}
	
	public static double hypotenuse (double side1, double side2) {
		
		double result = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		return result;
	}
}
