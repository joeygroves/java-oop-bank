
public class SavingsAccount extends BankAccount {

	private double accountBalance;
	
	public SavingsAccount(double newBal) {
		super(newBal);
		
		if ( newBal < 500 ) { 
			double monthlyRate = getMonthlyInterestRate() * 2;
			modifyInterestRate(monthlyRate*12); //Converts monthly rate to annual
		}
		
		else {
			modifyInterestRate(0);
		}
		
		this.accountBalance = newBal; //Sets initial account balance
	}

}

