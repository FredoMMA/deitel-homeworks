package Cap6;

public class Ex6_17EvenOrOdd {

	public static void main(String[] args) {
		
		boolean result;
		
		for(int number = 1; number <= 15; ++number) {
			
			result = isEven(number);
			System.out.printf("The number %d is even: %b%n%n", number, result);
		}
	}
	
	public static boolean isEven(int number) {
		
		boolean result;
		
		if(number % 2 == 0) {
			
			result = true;
		}
		
		else {
			
			result = false;
		}
		
		return result;
	}
}
