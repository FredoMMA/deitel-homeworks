package Cap6;

public class Exponentiation {

	public static int integerPower(int base, int exponential) {
		
		int result = base;
		
		for(int counter = 1; counter <= exponential; ++counter) {
			
			result *= base;
		}
		
		return result;
	}
} // end class
