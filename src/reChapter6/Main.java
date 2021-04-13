package reChapter6;

import java.util.function.IntBinaryOperator;

public class Main {
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator func = Main::sub;
		int a = func.applyAsInt(60, 49);
		System.out.println("60 - 49 = " + a);
	}

}
