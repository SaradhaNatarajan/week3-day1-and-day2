package Week3day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit account in Axis account");
			}
	

	public static void main(String[] args) {
		BankInfo obj = new BankInfo();
		AxisBank objAxis = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
		objAxis.deposit();

	}

}
