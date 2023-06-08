package exception;

public class TestBankBalance {

	public static void main(String[] args) {
		BankBalance b=new BankBalance();
		System.out.println("my initial balance = "+b.showBalance());
		b.deposit(5000);
		System.out.println("balance after deposit = "+b.showBalance());
		try {
			b.withdraw(20000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("balance after withdrawl = "+b.showBalance());
	}

}
