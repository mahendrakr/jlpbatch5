package controlflow;

public class ATM {
	int availableCash=15000;
	public String withdraw(int amount) {
		if(amount<=availableCash) {
			availableCash=availableCash-amount;
			return "collect your cash";
		}
		else {
			return "enter amount is higher then available cash: "+availableCash;
		}
	}

}
