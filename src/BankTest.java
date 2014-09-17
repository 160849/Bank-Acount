
public class BankTest {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000, ("Matthew Lin"));//creates an account with $1000 owned by "Matthew Lin"
		myAccount.deposit(505.22);//deposits $505.22
		System.out.println(myAccount.balance);//prints the balance
		myAccount.withdraw(100);//withdraws $100
		System.out.println(myAccount.printbalance());//prints the balance as a String
	}

}
