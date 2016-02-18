package Cap6;

public class Ex6_25PrimeNumbers {

	public static void main(String[] args) {
		
		for(int n = 2; n <= 10000; ++n) { // letter B
			
			boolean result = isPrime(n);
			
			if(result == true) {
				
				System.out.println("The number " + n + " is prime");
			}
		}
		
	} // end main
	
	public static boolean isPrime(int prime) { // letter A
		
		boolean result = false;
		int number = 0;
		
		for(int counter = 1; counter <= prime; ++counter) {
			
			if(prime % counter == 0) {
				
				++number;
			}
		}
		
		if(number == 2) {
			
			result = true;
		}
		
		if(number != 2 || prime == 1) {
			
			result = false;
		}
		
		return result;
	} // end method isPrime
} // end class
