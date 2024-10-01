package entity;

public class Account {
	private int accNo;
	private String accHolderName;
	private double balance;

	public Account() {
		accNo = 0;
		accHolderName = null;
		balance = 0;
	}

	public Account(int accNo, String accHolder, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolder;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolderName;
	}

	public void setAccHolder(String accHolder) {
		this.accHolderName = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}

}
