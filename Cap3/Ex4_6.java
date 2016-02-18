package Cap3;

public class Ex4_6 {
	
	public static void main (String[] args) {
		
		int sum = 0;
		int x = 1;
		
		while (x < 10) {
			
			// sum += x;
			// ++x; 
			sum += x++;
		}
		
		System.out.printf("The sum is: %d%n", sum);
	}
}
