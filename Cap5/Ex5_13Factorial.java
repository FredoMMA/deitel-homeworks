package Cap5;

public class Ex5_13Factorial {

	public static void main(String[] args) {
		
		int value = 70;
		long result = value;
		int total = value;
		
		for(int counter = 1; counter < total; ++counter) {
			
			value -= 1;
			result *= value;
		}
		
		System.out.printf("%s%,d", "The factorial of 20 is: ", result);
	}
}

// What difficulty might prevent you from calculating the factorial of 100?
// The number of the factorial of 100 will be too high for the long variable to handle