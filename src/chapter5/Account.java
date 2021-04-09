package chapter5;

//　口座クラス
public class Account {
	private String accountNo;
	private int balance;
	private AccountType accountType;

	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public AccountType getAccountType() {
		return this.accountType;
	}

}
