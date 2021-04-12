package chapter1;

public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリ";
		String s2 = "Java";
		String s3 = "java";
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s1.length());
		
		System.out.println(s1.isEmpty());
	}
}
