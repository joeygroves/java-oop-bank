
public class ClassicAccount extends BankAccount {

	private double accountBalance;
	
	public ClassicAccount(double newBal) {
		super(newBal);
		
		this.accountBalance = newBal; //Sets initial account balance
		
		double monthlyRate = getMonthlyInterestRate() * 1.15; //Multiplies Monthly rate by 1.15%
		modifyInterestRate(monthlyRate*12);
	}

}
