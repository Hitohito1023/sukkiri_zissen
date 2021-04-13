package reChapter6;

import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
//		IntBinaryOperator func = (int a, int b) -> { return a * b; };
//
//		int a = func.applyAsInt(40, 33);
//		System.out.println(a);

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		integerList.stream() // streamの取得
//		        .filter(i -> i % 2 == 0) // 中間操作
		        .forEach(i -> System.out.println(i % 2 == 0));
	}

}
