package Cap3;

import java.util.Scanner;

public class Ex4_38Privacy {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String dataString = "0";
		String decryptString = "0";
		int data;
		int decrypt;
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		int n = 0;
		int option;
		
		System.out.println("Enforcing Privacy with Cryptography");
		System.out.println("1 - Encrypt data");
		System.out.println("2 - Decrypt data");
		System.out.println("3 - Quit the program");
		option = input.nextInt();
		
		while(option != 3) {
			
			while(option == 1) {
				
				System.out.print("Insert a new data to encrypt: ");
				dataString = input.next();
				data = Integer.valueOf(dataString.trim());
				
				while(data < 0000 || data > 9999) {
					
					System.out.println("Invalid data");
					System.out.print("Insert a new data to encrypt: ");
					data = input.nextInt();
				}
				
				if(data < 1000) {
					
					first = 0;
				}
				
				if(data >= 1000) {
					
					first = data / 1000;
				}
				
				if(data < 100) {
					
					second = 0;
				}
				
				if(data >= 100) {
					
					second = (data / 100) - (first * 10);
				}
				
				if(data < 10) {
					
					third = 0;
				}
				
				if(data >= 10) {
					
					third = (data / 10) - (first * 100) - (second * 10);
				}
				
				fourth = (data) - (first * 1000) - (second * 100) - (third * 10);
				
				first = ((first + 7) % 10);
				second = ((second + 7) % 10);
				third = ((third + 7) % 10);
				fourth = ((fourth + 7) % 10);
				
				n = first;
				first = third;
				third = n;
				
				n = second;
				second = fourth;
				fourth = n;
								
				decrypt = (first * 1000) + (second * 100) + (third * 10) + fourth;
				
				if(decrypt == 0) {
					
					decryptString = "0000";
				}
				
				if(decrypt < 10) {
					
					decryptString = Integer.toString(decrypt);
					decryptString = "000" + decryptString;
				}
				
				if(decrypt < 100) {
					
					decryptString = Integer.toString(decrypt);
					decryptString = "00" + decryptString;
				}
				
				if(decrypt < 1000) {
					
					decryptString = Integer.toString(decrypt);
					decryptString = "0" + decryptString;
				}
				
				if(decrypt >= 1000) {
					
					decryptString = Integer.toString(decrypt);
				}
				
				System.out.printf("The encrypt of %s is %s%n%n", dataString, decryptString);
				
				System.out.println("Enforcing Privacy with Cryptography");
				System.out.println("1 - Encrypt data");
				System.out.println("2 - Decrypt data");
				System.out.println("3 - Quit the program");
				option = input.nextInt();
			}
			
			while(option == 2) {
				
				System.out.print("Insert a new encrypted data to decrypt: ");
				decryptString = input.next();
				decrypt = Integer.valueOf(decryptString.trim());
				
				while(decrypt < 0000 || decrypt > 9999) {
					
					System.out.println("Invalid data");
					System.out.print("Insert a new encrypted data to decrypt: ");
					decrypt = input.nextInt();
					
				}
				
				if(decrypt < 1000) {
					
					first = 0;
				}
				
				if(decrypt >= 1000) {
					
					first = decrypt / 1000;
				}
				
				if(decrypt < 100) {
					
					second = 0;
				}
				
				if(decrypt >= 100) {
					
					second = (decrypt / 100) - (first * 10);
				}
				
				if(decrypt < 10) {
					
					third = 0;
				}
				
				if(decrypt >= 10) {
					
					third = (decrypt / 10) - (first * 100) - (second * 10);
				}
				
				fourth = (decrypt) - (first * 1000) - (second * 100) - (third * 10);
				
				
				first = redoRemainder(first);
				second = redoRemainder(second);
				third = redoRemainder(third);
				fourth = redoRemainder(fourth);
				
				n = first;
				first = third;
				third = n;
				
				n = second;
				second = fourth;
				fourth = n;
				
				data = (first * 1000) + (second * 100) + (third * 10) + fourth;
				
				if(data == 0) {
					
					dataString = "0000";
				}
				
				if(data < 10) {
					
					dataString = Integer.toString(data);
					dataString = "000" + dataString;
				}
				
				if(data < 100) {
					
					dataString = Integer.toString(data);
					dataString = "00" + dataString;
				}
				
				if(data < 1000) {
					
					dataString = Integer.toString(data);
					dataString = "0" + dataString;
				}
				
				if(data >= 1000) {
					
					dataString = Integer.toString(data);
				}
				
				decryptString = Integer.toString(decrypt);
				
				System.out.printf("The decrypt of %s is %s %n%n", decryptString, dataString);
				
				System.out.println("Enforcing Privacy with Cryptography");
				System.out.println("1 - Encrypt data");
				System.out.println("2 - Decrypt data");
				System.out.println("3 - Quit the program");
				option = input.nextInt();
				
				}
								
			}
		}
		
	
	public static int redoRemainder(int number) {
		
		int redo = 0;
		
		if(number == 7 % 10) {
			
			redo = 0;
		}
		
		if(number == 8 % 10) {
			
			redo = 1;
		}
		
		if(number == 9 % 10) {
			
			redo = 2;
		}
		
		if(number == 10 % 10) {
			
			redo = 3;
		}
		
		if(number == 11 % 10) {
			
			redo = 4;
		}
		
		if(number == 12 % 10) {
			
			redo = 5;
		}
		
		if(number == 13 % 10) {
			
			redo = 6;
		}
		
		if(number == 14 % 10) {
			
			redo = 7;
		}
		
		if(number == 15 % 10) {
			
			redo = 8;
		}
		
		if(number == 16 % 10) {
			
			redo = 9;
		}
		
		return redo;
	}

}
