package oops.abstraction;

public class HDFC implements RBI {
	//when we have acquire property of anther class then we use extends and when we have to create interface then we use implemets.
//we can acheive multiple inheritance in case of interface
	@Override
	public void savingaccount() {
		System.out.println("HDFC saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC currentAccount ");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC debitCard ");
		
	}

	@Override
	public void creditCard() {
		System.out.println("HDFC creditCard ");
		
	}

}
