package Cap5;

public class Ex5_30AutoPolicy {

	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	public Ex5_30AutoPolicy(int accountNumber, String makeAndModel, String state) {
		
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		
		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" || state == "NY" || state == "PA" || state == "VT") {
			
			this.state = state;
		}
		
		else {
			
			System.out.println("Error");
		}

	}
	
	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel) {
		
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel() {
		
		return makeAndModel;
	}
	
	public void setState(String state) {
		
		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" || state == "NY" || state == "PA" || state == "VT") {
			
			this.state = state;
		}
		
		else {
			
			System.out.println("Error");
		}
		
	}
	
	public String getState() {
		
		return state;
	}
	
	public boolean isNoFaultState() {
		
		boolean noFaultState;
		
		switch(getState()) {
		
			case "MA": case "NJ": case "NY": case "PA":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
		}
		
		return noFaultState;
	}
		
}
