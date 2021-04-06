package atm;

public class account 
{
	//account holder name
	String holderName;
	//account no.
	int accno;
	//balance
	int balance;
	//pin
	int pin;
	// constructor
	account(String holdername, int accno, int balance, int pin)
	{
		this.holderName = holdername;
		this.accno = accno;
		this.balance = balance;
		this.pin = pin;
	}
	// methods
}
