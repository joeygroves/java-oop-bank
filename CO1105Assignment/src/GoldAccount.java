// Author: Joey Groves
public class GoldAccount extends BankAccount {

	private double accountBalance;

	public GoldAccount(double newBal) {
		super(newBal);
		if ( newBal < 2000 ) { //If account balance is greater or equal to £2000, minus £50
			this.accountBalance = newBal;
			this.accountBalance -= 50;
		}
		else {
			this.accountBalance = newBal; //Sets initial account balance
		}

		double monthlyRate = getMonthlyInterestRate() * 2.8; //Multiplies Monthly rate by 2.8%

		modifyInterestRate(monthlyRate*12); //Converts monthly rate to annual

		//Calculates 1 month
		/*System.out.println(accountBalance);
		System.out.println(calculateMonthlyInterest());
		System.out.println(addMonthlyInterest()); */

		}

	public double calculateMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 12;
		//System.out.println(monthlyInterestRate);
		return accountBalance * monthlyInterestRate;
	}

	public double addMonthlyInterest() {
		return this.accountBalance + calculateMonthlyInterest();
	}

	public double getBal() {
		return this.accountBalance;
	}

	public void withdraw(double withAmt) {
		this.accountBalance -= withAmt;
	}

	public void deposit(double depAmt) {
		this.accountBalance += depAmt;
	}

}
