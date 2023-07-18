package day05.practice;

/**
 * Create an IciciATM implementation which will have withdrawal charges of 10 rupees.
 * If the balance is less than 10000, the withdraw method should throw and exception
 * Implement the Deposit method which is common for all the Banks.
 * @author VigneshwarVijayakuma
 *
 */

public class IciciATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		if (amount > 0) {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance + amount;
			account.setBalance(finalBalance);
			return true;
		} else {
			throw new IllegalArgumentException("Amount can not be zero or less than zero");
		}
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 10000) {
			throw new Exception("Account Balance can not be less than 10000");
		} else {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance - amount - 10;
			account.setBalance(finalBalance);
			return true;
		}

	}

	@Override
	public double getBalance() {
		return this.getBalance();
	}

}
