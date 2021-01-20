
public class BankAccount {
	
	static double annualInterestRate = 1.5;
	private double accountBalance;
	
	public BankAccount(double newBal) {
		this.accountBalance = newBal;
	}
	
	public double calculateMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate / 12;
		return this.accountBalance * monthlyInterestRate;
	}
	
	public double addMonthlyInterest() {
		return this.accountBalance + calculateMonthlyInterest();
	}
	
	public void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	public void withdraw(double withAmt) {
		this.accountBalance -= withAmt;
	}
	
	public void deposit(double depAmt) {
		this.accountBalance += depAmt;
	}
	
	public double getBal() {
		return this.accountBalance;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
}
