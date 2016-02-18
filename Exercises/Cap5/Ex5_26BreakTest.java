package Cap5;

public class Ex5_26BreakTest {

	public static void main(String[] args) {
		
		int count;
		
		for(count = 1; count <= 10; count++) {
			
			if(count != 5) {
				
				System.out.printf("%d ", count);
			}
			
			if(count == 5) {
				
				for(count = 5; count <= 10; count++) {
					
				}
			}
		}
		
		while(count != 5 - 1) {
			
			--count;
		}
		System.out.printf("%nBroke out of a loop at count %d%n", count);
	}
} //end class BreakTest
