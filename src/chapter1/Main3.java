package chapter1;

public class Main3 {
	public static void main(String[] args) {
		final String FORMAT = "%-9s %-13s 所持金%,6d";

		Hero h1 = new Hero("taro", "hunter", 3000);
		Hero h2 = new Hero("ichiro", "witch", 12000);
		Hero h3 = new Hero("jiro", "police", 30);

		String s1 = String.format(FORMAT, h1.getName(), h1.getJob(), h1.getMoney());
		System.out.println(s1);

		String s2 = String.format(FORMAT, h2.getName(), h2.getJob(), h2.getMoney());
		System.out.println(s2);

		String s3 = String.format(FORMAT, h3.getName(), h3.getJob(), h3.getMoney());
		System.out.println(s3);

	}

}
