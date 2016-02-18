package Cap3;

public class Ex4_7 {
	
	public static void main (String[] args) {
		
		int y = 5;
		int x = 5;
		
		y *= x++;
		System.out.printf("The value of Y: %d%nThe value of X: %d%n", y, x);
		
		int a = 10;
		int b = 7;
		double c = (double) a / b;
		System.out.printf("%f", c);
	}
}
