package oops.abstraction;

public interface RBI extends Modi, CB{

	// you cannot create a object of an interface, interface contains incomplete
	// methods that is all abstract class are present
	public void savingaccount();

	public void currentAccount();

	public void debitCard();

	public void creditCard();
}
