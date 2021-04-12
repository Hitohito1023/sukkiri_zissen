package chapter1;

public class Hero {
	private String name;
	private String job;
	private int money;

	public String getName() {
		return this.name;
	}

	public String getJob() {
		return this.job;
	}

	public int getMoney() {
		return this.money;
	}

	public Hero(String name, String job, int money) {
		this.name = name;
		this.job = job;
		this.money = money;
	}

}
