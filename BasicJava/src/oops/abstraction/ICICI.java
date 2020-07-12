package oops.abstraction;

public class ICICI implements RBI  {

	@Override
	public void savingaccount() {
		System.out.println("ICICI saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI currentAccount ");
		
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI debitCard ");
		
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI creditCard ");
		
	}

}
