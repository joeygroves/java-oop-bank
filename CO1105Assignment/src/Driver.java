import java.text.DecimalFormat;

public class Driver {

	public static void main(String[] args) {
		
		double intRate = 1.5; //Variable for setting initial annualInterestRate
		
		double markAccBal = 1200; //Mark's account balance
		double markDep = 3000; //Mark's monthly income
		double markWid = 2200; //Mark's monthly expenses
		
		double willAccBal = 1000; //Will's account balance
		double willDep = 2000; //Will's monthly income
		double willWid = 1050; //Will's monthly expenses
		
		
		BankAccount bA = new BankAccount(0); 
		bA.modifyInterestRate(intRate); //Sets annualInterestRate to 1.5%
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Mark (After 2 months)");
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		//Mark: Gold
		GoldAccount goldMark1 = new GoldAccount(markAccBal);
		
		goldMark1.deposit(markDep); //Monthly Income of Mark
		goldMark1.withdraw(markWid); //Monthly Expenses of Mark
		double gM1 = goldMark1.addMonthlyInterest(); //Month 1's account balance
		
		bA.modifyInterestRate(intRate);
		GoldAccount goldMark2 = new GoldAccount(gM1);
		goldMark2.deposit(markDep); //Monthly Income of Mark
		goldMark2.withdraw(markWid); //Monthly Expenses of Mark
		
		DecimalFormat df = new DecimalFormat("#.##"); //Displays only 2dp
		System.out.println("Gold Account: £" + df.format(goldMark2.addMonthlyInterest())); //Month 2
		
		//Mark: Classic
		bA.modifyInterestRate(intRate);
		ClassicAccount classicMark1 = new ClassicAccount(markAccBal);
		classicMark1.deposit(markDep); //Monthly Income of Mark
		classicMark1.withdraw(markWid); //Monthly Expenses of Mark
		double cM1 = classicMark1.addMonthlyInterest(); //Month 1 account balance
		
		bA.modifyInterestRate(intRate);
		ClassicAccount classicMark2 = new ClassicAccount(cM1);
		classicMark2.deposit(markDep); //Monthly Income of Mark
		classicMark2.withdraw(markWid); //Monthly Expenses of Mark
		
		
		System.out.println("Classic Account: £" + df.format(classicMark2.addMonthlyInterest())); //Month 2
		
		
		//Mark: Savings
		bA.modifyInterestRate(intRate);
		SavingsAccount savingsMark1 = new SavingsAccount(markAccBal);
		savingsMark1.deposit(markDep); //Monthly Income of Mark
		savingsMark1.withdraw(markWid); //Monthly Expenses of Mark
		double sM1 = savingsMark1.addMonthlyInterest(); //Month 1 account balance
		
		bA.modifyInterestRate(intRate);
		SavingsAccount savingsMark2 = new SavingsAccount(sM1);
		savingsMark2.deposit(markDep); //Monthly Income of Mark
		savingsMark2.withdraw(markWid); //Monthly Expenses of Mark
		
		
		System.out.println("Savings Account: £" + df.format(savingsMark2.addMonthlyInterest())); //Month 2

		
		
		/* Will's Section */
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("Will (After 2 months)");
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		
		//Will: Gold
		bA.modifyInterestRate(intRate);
		GoldAccount goldWill1 = new GoldAccount(willAccBal);
		goldWill1.deposit(willDep); //Monthly Income of Will
		goldWill1.withdraw(willWid);
		double gW1 = goldWill1.addMonthlyInterest(); //Month 1 account balance
		
		bA.modifyInterestRate(intRate);
		GoldAccount goldWill2 = new GoldAccount(gW1);
		goldWill2.deposit(willDep); //Monthly Income of Will
		goldWill2.withdraw(willWid);
		
		
		System.out.println("Gold Account: £" + df.format(goldWill2.addMonthlyInterest())); //Month 2
		
		
		//Will: Classic
		bA.modifyInterestRate(intRate);
		ClassicAccount classicWill1 = new ClassicAccount(willAccBal);
		classicWill1.deposit(willDep); //Monthly Income of Will
		classicWill1.withdraw(willWid); //Monthly Expenses of Will
		double cW1 = classicWill1.addMonthlyInterest(); //Month 1 account balance
		
		bA.modifyInterestRate(intRate);
		ClassicAccount classicWill2 = new ClassicAccount(cW1);
		classicWill2.deposit(willDep); //Monthly Income of Will
		classicWill2.withdraw(willWid); //Monthly Expenses of Will
		
		
		System.out.println("Classic Account: £" + df.format(classicWill2.addMonthlyInterest())); //Month 2
		
		
		//Will: Savings
		bA.modifyInterestRate(intRate);
		SavingsAccount savingsWill1 = new SavingsAccount(willAccBal);
		savingsWill1.deposit(willDep); //Monthly Income of Will
		savingsWill1.withdraw(willWid); //Monthly Expenses of Will
		double sW1 = savingsWill1.addMonthlyInterest(); //Month 1 account balance
		
		bA.modifyInterestRate(intRate);
		SavingsAccount savingsWill2 = new SavingsAccount(sW1);
		savingsWill2.deposit(willDep); //Monthly Income of Will
		savingsWill2.withdraw(willWid); //Monthly Expenses of Will
	
		
		System.out.println("Savings Account: £" + df.format(savingsWill2.addMonthlyInterest())); //Month 2
		
		

	}

}
