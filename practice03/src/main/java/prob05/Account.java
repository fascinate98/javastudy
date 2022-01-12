package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String no) {
		accountNo = no;
	}
	
	public void save(int mon) {
		balance += mon;
	}
	
	public void deposit(int mon) {
		balance -= mon;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
