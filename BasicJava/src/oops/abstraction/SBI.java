package oops.abstraction;

public class SBI implements RBI  {

	@Override
	public void savingaccount() {
		System.out.println("SBI saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI currentAccount ");
	}

	@Override
	public void debitCard() {
		System.out.println("SBI debitCard ");
		
	}

	@Override
	public void creditCard() {
		System.out.println("SBI creditCard ");
		
	}

}
