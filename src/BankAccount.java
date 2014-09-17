
public class BankAccount {
	double balance;//creates a double variable that is the balance of the account
	String name;//creates a variable that is the name of the account owner
	
	public BankAccount(double _balance, String _name){//constructor takes in 2 variables, a double and a string
		balance = _balance;//initializes the balance as the double entered
		name = _name;//initializes the name as the String entered
	}
	
	public void deposit(double deposit){//method deposit adds to the balance
		balance = balance + deposit;
	}
	
	public void withdraw(double withdraw){//method withdraw takes from the balance
		balance = balance - withdraw;
	}

	public String printbalance(){//prints the balance as a String
		return name + "'s account balance is $" + balance;
	}
}