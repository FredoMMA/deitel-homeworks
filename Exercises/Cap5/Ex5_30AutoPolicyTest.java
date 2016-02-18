package Cap5;

public class Ex5_30AutoPolicyTest {

	public static void main(String[] args) {
		
		Ex5_30AutoPolicy policy1 = new Ex5_30AutoPolicy(11111111, "Toyota Camry", "NJ");
		Ex5_30AutoPolicy policy2 = new Ex5_30AutoPolicy(22222222, "Ford Fusion", "ME");
		Ex5_30AutoPolicy policy3 = new Ex5_30AutoPolicy(33333333, "Ford Mustang", "MG");

		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		policyInNoFaultState(policy3);
	}
	
	public static void policyInNoFaultState(Ex5_30AutoPolicy policy) {
		
		System.out.println("The auto policy");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), 
				policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}
}
