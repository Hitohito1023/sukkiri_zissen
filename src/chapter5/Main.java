package chapter5;

public class Main {
	public static void main(String[] args) {
		Account a = new Account("111333", AccountType.FUTSU);


		System.out.println(a.getAccountNo());
		System.out.println(a.getAccountType());
	}

}
