package Cap6;

public class Ex6_34TableOfBOHN {

	public static void main(String[] args) {
		
		int binary;
		int octal;
		String hexadecimal;
		
		System.out.printf("%7s%15s%15s%15s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
		
		for(short decimal = 0; decimal <= 256; ++decimal) {
			
			binary = decimalToBinary(decimal);
			octal = decimalToOctal(decimal);
			hexadecimal = decimalToHexa(decimal);
			System.out.printf("%7d%15d%15d%15s%n", decimal, binary, octal, hexadecimal);
		}
	}
	
	public static int decimalToBinary(short decimal) {
		
		int binary = 0;
		
		for(short n = 0; decimal >= 1; ++n) {
			
			binary += (int) ((decimal % 2) * Math.pow(10, n));
			decimal /= 2;
		}
		
		return binary;
	}
	
	public static int decimalToOctal(short decimal) {
		
		int octal = 0;
		
		for(short n = 0; decimal >= 1; ++n) {
			
			octal += (int) ((decimal % 8) * Math.pow(10, n));
			decimal /= 8;
		}
		
		return octal;
	}
	
	public static String decimalToHexa(short decimal) {
		
		String hexadecimal = "";
		int number = 0;
		String numberS = "";
		
		if(decimal == 0) {
			
			hexadecimal = "0";
		}

		for(short n = 0; decimal >= 1; ++n) {
			
			number = decimal % 16;
			
			if(number >= 0 && number < 10) {
				
				hexadecimal = number + hexadecimal;
			}
			
			if(number >= 10 && number <= 15) {
				
				if(number == 10) {
					
					numberS = "A";
				}
				
				if(number == 11) {
					
					numberS = "B";
				}
				
				if(number == 12) {
					
					numberS = "C";
				}
				
				if(number == 13) {
					
					numberS = "D";
				}
				
				if(number == 14) {
					
					numberS = "E";
				}
				
				if(number == 15) {
					
					numberS = "F";
				}
				
				hexadecimal = numberS + hexadecimal;
			}
			decimal /= 16;
		}
		
		return hexadecimal;
	}
}
