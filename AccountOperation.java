package operations;

import entity.Account;

public class AccountOperation {
	public boolean withdraw(Account account, double amount) { // 2000
		double bal = account.getBalance(); // 30000
		if (bal < amount) {
			System.out.println("Not Enough Balance !!");
			return false;
		} else if (amount < 0) {
			System.out.println("Withdraw amount can not be -ve...");
			return false;
		} else {
			bal = bal - amount; // 30000-2000=28000
			account.setBalance(bal);
			return true;
		}
	}

	public boolean deposit(Account account, double amount) {
		double bal = account.getBalance();
		if (amount < 0) {
			System.out.println("Deposit amount cannot be -ve...");
			return false;
		} else if (amount > 100000) {
			System.out.println("Show the Proof...!!!");
			return false;
		} else {
			bal = bal + amount;
			account.setBalance(bal);
			return true;

		}

	}
	public double checkbalance(Account account)
	{
		double bal=account.getBalance();
		return bal;
	}

	// account1
	// account2
	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();
		if (amount < 0) {
			System.out.println("Transfer amount cannot be -ve...");
			return false;
		} else if (bal1 < amount) {
			System.out.println("Not Enough Balance........");
			return false;
		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;
			account1.setBalance(bal1);
			account2.setBalance(bal2);
			return true;
		}
	}

}
