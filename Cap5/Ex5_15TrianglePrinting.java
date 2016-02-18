package Cap5;

public class Ex5_15TrianglePrinting {

	public static void main(String[] args) {
		
		System.out.println("A");
		for(int counter = 1; counter <= 10; ++counter) {
			
			for(int asterisk = 1; asterisk <= counter; ++asterisk) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		System.out.println("B");
		for(int counter = 1; counter <= 10; ++counter) {
			
			for(int asterisk = 10; asterisk >= counter; --asterisk) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		System.out.println("C");
		for(int counter = 1; counter <= 10; ++counter) {
			
			for(int space = 1; space < counter; ++space) {
				
				System.out.print(" ");
			}
			
			for(int asterisk = 10; asterisk >= counter; --asterisk) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
		
		System.out.println("D");
		for(int counter = 1; counter <= 10; ++counter) {
			
			for(int space = 10; space > counter; --space) {
				
				System.out.print(' ');
			}
			
			for(int asterisk = 1; asterisk <= counter; ++asterisk) {
				
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
}
