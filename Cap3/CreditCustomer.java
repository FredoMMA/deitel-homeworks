package Cap3;

public class CreditCustomer {
	
	private int accountNumber;
	private int beginningBalance;
	private int totalItemsMonth;
	private int totalCreditMonth;
	private int creditLimit;
	private int newBalance;
	
	public CreditCustomer(int accountNumber, int beginningBalance, int totalItemsMonth, int totalCreditMonth, int creditLimit) {
		
		this.accountNumber = accountNumber;
		
		if(beginningBalance > 0) {
			
			this.beginningBalance = beginningBalance;
		}
		
		if(totalItemsMonth > 0) {
			
			this.totalItemsMonth = totalItemsMonth;
		}
		
		if(totalCreditMonth > 0) {
			
			this.totalCreditMonth = totalCreditMonth;
		}
		
		if(creditLimit > 0) {
			
			this.creditLimit = creditLimit;
		}
	} // end constructor
	
	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		
		return accountNumber;
	}
	
	public void setBeginningBalance(int beginningBalance) {
		
		if(beginningBalance > 0) {
			
			this.beginningBalance = beginningBalance;
		}
	}
	
	public int getBeginningBalance() {
		
		return beginningBalance;
	}
	
	public void setTotalItemsMonth(int totalItemsMonth) {
		
		if(totalItemsMonth > 0) {
			
			this.totalItemsMonth = totalItemsMonth;
		}
	}
	
	public int getTotalItemsMonth() {
		
		return totalItemsMonth;
	}
	
	public void setTotalCreditMonth(int totalCreditMonth) {
		
		if(totalCreditMonth > 0) {
			
			this.totalCreditMonth = totalCreditMonth;
		}
	}
	
	public int getTotalCreditMonth() {
		
		return totalCreditMonth;
	}
	
	public void setCreditLimit(int creditLimit) {
		
		if(creditLimit > 0) {
			
			this.creditLimit = creditLimit;
		}
	}
	
	public int getCreditLimit() {
		
		return creditLimit;
	}
	
	public void getNewBalance() {
		
		newBalance = beginningBalance + totalItemsMonth - totalCreditMonth;
		System.out.printf("New Balance: %d", newBalance);
		
		if(newBalance > creditLimit) {
			
			System.out.printf("The credit limit of %d is exceeded", accountNumber);
		}
	}

}
