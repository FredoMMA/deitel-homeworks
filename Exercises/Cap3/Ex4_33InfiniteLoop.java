package Cap3;

public class Ex4_33InfiniteLoop {
	
	public static void main(String[] args) {
		
		int num = 2;
		
		while(num >= 2) {
			
			System.out.printf("%d %n", num);
			num *= 2;
		}
	}

}
