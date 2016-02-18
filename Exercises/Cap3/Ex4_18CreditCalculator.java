package Cap3;

import java.util.Scanner;

public class Ex4_18CreditCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CreditCustomer customer1 = new CreditCustomer(123, 1000, 300, 500, 1500);
		CreditCustomer customer2 = new CreditCustomer(345, 2000, 700, 1000, 2000);
		CreditCustomer customer3 = new CreditCustomer(0, 0, 0, 0, 0);
		
		int numberA = 2;
		CreditCustomer account = null;
		
		System.out.println("Credit Limit Calculator\n");
		System.out.printf("Account: %d%n  Beginning Balance: %d%n  Total of all items charged this month: %d%n  Total of credits applied this month: %d%n  Allowed credit limit: %d%n%n", customer1.getAccountNumber(), customer1.getBeginningBalance(), customer1.getTotalItemsMonth(), customer1.getTotalCreditMonth(), customer1.getCreditLimit());
		customer1.getNewBalance();
		System.out.println("");
		
		System.out.printf("Account: %d%n  Beginning Balance: %d%n  Total of all items charged this month: %d%n  Total of credits applied this month: %d%n  Allowed credit limit: %d%n%n", customer2.getAccountNumber(), customer2.getBeginningBalance(), customer2.getTotalItemsMonth(), customer2.getTotalCreditMonth(), customer2.getCreditLimit());
		customer2.getNewBalance();
		System.out.println("");
		
		System.out.print("Do you wish to create a new account? \n1 - Yes\n0 - No");
		int create = input.nextInt();
		
		while(create != 0) {
			
			++numberA;
			account = account+numberA;
		}
		
		System.out.print("Insert a new account number: ");
		int accountNumber = input.nextInt();
		customer3.setAccountNumber(accountNumber);
		System.out.println("");
		
		System.out.printf("Insert the beginning balance of account %d: ", customer3.getAccountNumber());
		int beginningBalance = input.nextInt();
		customer3.setBeginningBalance(beginningBalance);
		System.out.println("");
		
		System.out.printf("Insert the total of all items charged this month of the account %d: ", customer3.getAccountNumber());
		int totalItemsMonth = input.nextInt();
		customer3.setTotalItemsMonth(totalItemsMonth);
		System.out.println("");
		
		System.out.printf("Insert the total of credits applied to the account %d this month: ", customer3.getAccountNumber());
		int totalCreditMonth = input.nextInt();
		customer3.setTotalCreditMonth(totalCreditMonth);
		System.out.println("");
		
		System.out.printf("Insert the credit limit of the account %d: ", customer3.getAccountNumber());
		int creditLimit = input.nextInt();
		customer3.setCreditLimit(creditLimit);
		System.out.println("");
		
		customer3.getNewBalance();
		System.out.println("");
	
	}
	
	public static void createCustomerAccount() {
		
		Scanner input = new Scanner(System.in);
		
		int numberA = 2;
		String newAccount;
		
		++numberA;
		String numberString = Integer.toString(numberA);
		newAccount = "account"+numberString;
		
		
		
		CreditCustomer newAccount
		
		System.out.print("Insert a new account number: ");
		int accountNumber = input.nextInt();
		newAccount.setAccountNumber(accountNumber);
		System.out.println("");
		
		System.out.printf("Insert the beginning balance of account %d: ", customer3.getAccountNumber());
		int beginningBalance = input.nextInt();
		customer3.setBeginningBalance(beginningBalance);
		System.out.println("");
		
		System.out.printf("Insert the total of all items charged this month of the account %d: ", customer3.getAccountNumber());
		int totalItemsMonth = input.nextInt();
		customer3.setTotalItemsMonth(totalItemsMonth);
		System.out.println("");
		
		System.out.printf("Insert the total of credits applied to the account %d this month: ", customer3.getAccountNumber());
		int totalCreditMonth = input.nextInt();
		customer3.setTotalCreditMonth(totalCreditMonth);
		System.out.println("");
		
		System.out.printf("Insert the credit limit of the account %d: ", customer3.getAccountNumber());
		int creditLimit = input.nextInt();
		customer3.setCreditLimit(creditLimit);
		System.out.println("");
	}

}
