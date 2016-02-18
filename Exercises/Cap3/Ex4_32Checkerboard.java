package Cap3;

public class Ex4_32Checkerboard {

	public static void main(String[] args) {
		
		int count = 1;
		int count2 = 1;
		
		while(count < 5) {
			
			printAsterisk(count2);
			
			System.out.print(" ");
			count2 = 1;
			
			printAsterisk(count2);
			
			++count;
			
		}
				
	} // end main
	
	public static void printAsterisk(int count2) {
		
		while(count2 < 9) {
			
			System.out.print("* ");
			++count2;
			
			if(count2 == 9) {
				
				System.out.println();
				
			}
		}
	} // end static method
	
} // end class
