package oops.abstraction;

public class BankUser  {

	public static void main(String[] args) {
		
		RBI bank1;
		bank1=new SBI();
		bank1.creditCard();
		bank1.debitCard();
		bank1.savingaccount();
		bank1.currentAccount();

		String Bank2="ICICI";
		
		if (Bank2.equals("ICICI"))
		{
			System.out.println("Bank of ICICI");
		}else if(Bank2.equals("HDFC")) {
			
		}
		RBI bank=new ICICI();
		account(bank);
		account(new SBI());//SBI==chrome
		account(new HDFC());//HDFC==firefox
		account(new ICICI());//ICICI=edge
		
	}
	
	public static void account(RBI bank)//RBI ==Webdriver-interface
	{
		bank.debitCard();//Navigate
		bank.savingaccount();//click
		bank.debitCard();//enter data
		bank.currentAccount();//select option
	}
	
}
