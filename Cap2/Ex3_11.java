package Cap2;

public class Ex3_11 
{
	private String name;
	private double balance;
	
	public Ex3_11(String name, double balance) // constructor
	{
		this.name = name;
		if(balance > 0.0) // if the balance is valid
		{
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
		{
			balance = balance + depositAmount;
		}
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount > 0.0 && withdrawAmount < balance )
		{
			balance = balance - withdrawAmount;
		}
		if (withdrawAmount > balance)
		{
			System.out.println("Withdrawal amount exceeded account balance.");
		}
		if (withdrawAmount < 0.0)
		{
			System.out.println("Invalid value.");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
