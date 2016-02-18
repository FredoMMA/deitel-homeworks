package Cap5;

public class Ex5_21PythagoreanTriples {

	public static void main(String[] args) {
		int side1;
		int side2;
		int hypotenuse;
		
		for(hypotenuse = 0; hypotenuse < 500; ++hypotenuse) {
			
			for(side1 = 0; side1 < 500; ++side1) {
				
				for(side2 = 0; side2 < 500; ++side2) {
					
					int result = (side1 * side1) + (side2 * side2);
					
					if((hypotenuse * hypotenuse) == result && hypotenuse < 500 && side1 != 0 && side2 != 0 && hypotenuse != 0) {
						
						System.out.printf("%d %d %d%n", side1, side2, hypotenuse);
					}
				}
			}
		}
	}
}
