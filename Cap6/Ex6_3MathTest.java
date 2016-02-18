package Cap6;

import java.util.Scanner;

public class Ex6_3MathTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert the value of X and of Y ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double a = Math.abs(x);
		
		double b = Math.ceil(x);
		
		double c = Math.cos(x);
		
		double d = Math.exp(x);
		
		double e = Math.floor(x);
		
		double f = Math.log(x);
		
		double g = Math.max(x, y);
		
		double h = Math.min(x, y);
		
		double i = Math.pow(x, y);
		
		double j = Math.sin(x);
		
		double k = Math.sqrt(x);
		
		double l = Math.tan(x);
		
		System.out.printf("%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n", 
				"absolute value of x: ", a,
				"rounds x to the smallest integer not less than x: ", b,
				"trigonometric cosine of x (x in radians): ", c,
				"exponential method e^x: ", d,
				"rounds x to the largest integer not greater than x: ", e,
				"natural logarithm of x (base e): ", f,
				"larger value of x and y: ", g,
				"smaller value of x and y: ", h,
				"x raised to the power y (i.e., x^y): ", i,
				"trigonometric sine of x (x in radians): ", j,
				"square root of x: ", k,
				"trigonometric tangent of x (x in radians): ", l);
	}
}
