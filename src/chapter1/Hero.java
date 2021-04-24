package chapter1;


/**
 * Heroクラス
 * @author kinaseryota
 *
 */
public class Hero {
	/** 名前 */
	private String name;
	/** 職種 */
	private String job;
	/** 所持金 */
	private int money;

	/** 名前を取得するメソッド */
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
