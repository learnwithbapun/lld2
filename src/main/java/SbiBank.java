import polymorphism.Bank;

public final class SbiBank extends Bank {
	
	

	int interestRate;
	
	
	public int interestRate(int id) {

		return 1;
	}

	public int interestRate(int id, int creditScrore) {

		return 1;
	}

	public int interestRate(int id, int creditScrore, int age) {

		return 1;
	}

	
	public static void main(String[] args) {
		
		
		Bank bank = new SbiBank();
		bank.interestRate(2);
	}
}
