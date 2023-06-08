package exception;

public class BankBalance {
	private int currentBalance = 10000;

	public void deposit(int amount) {
		currentBalance = amount + currentBalance;
	}

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount <= currentBalance) {
			currentBalance = currentBalance - amount;
		} else {
			throw new InsufficientBalanceException("insufficient balance in your account!!!");
		}

	}

	public int showBalance() {
		return currentBalance;
	}
}
