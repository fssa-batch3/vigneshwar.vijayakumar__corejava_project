package day05.practice;

/**
 * Create an AxisATM implementation which will have withdrawal charges of 5 rupees.
 * If the balance is less than 5000, the withdraw method should throw an exception
 *
 * @author VigneshwarVijayakuma
 *
 */

public class AxisATM implements ATM {

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
		if (account.getBalance() < 5000) {
			throw new Exception("Account Balance can not be less than 5000");
		} else {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance - amount - 5;
			account.setBalance(finalBalance);
			return true;
		}

	}

	@Override
	public double getBalance() {
		return this.getBalance();
	}

}
