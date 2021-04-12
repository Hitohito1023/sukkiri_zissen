package chapter1;

public class Main2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < 100; i++) {
//			sb.append("||^^||");
//		}
//		
//		String s = sb.toString();
//		
//		System.out.println(s);
		
		String s ="abcc,cccc,cccc,ccd";
		
//		System.out.println(s.matches("abc*d"));
//		
//		System.out.println(s.matches("abc.*"));
//		
//		System.out.println(s.matches(".*d"));
//		
		String[] ss = s.split(",");
		
		for (String n : ss) {
			System.out.println(n);
		}
	}

}
