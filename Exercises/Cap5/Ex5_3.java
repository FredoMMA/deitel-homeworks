package Cap5;

public class Ex5_3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; ++i) {
			
			System.out.print(i);
			
			if(i % 5 == 0) {
				
				System.out.println();
			}
			
			else {
				
				System.out.print('\t');
			}
			
		}
	}
}
