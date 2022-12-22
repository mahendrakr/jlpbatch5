package controlflow;

public class ATMtest {
	public static void main(String[] args) {
		ATM atm=new ATM();
		String result = atm.withdraw(5000);
		System.out.println(result);
		String result2 = atm.withdraw(5000);
		System.out.println(result2);
		String result3 = atm.withdraw(3000);
		System.out.println(result3);
		String result4 = atm.withdraw(5000);
		System.out.println(result4);
		String result5 = atm.withdraw(2000);
		System.out.println(result5);
		String result6 = atm.withdraw(3000);
		System.out.println(result6);
	}

}
