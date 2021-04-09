package chapter6;

interface Func1 {
	boolean call(int x);
}

interface Func2 {
	String call(boolean male, String name);
}

public class Main {
//	public static int sub(int a, int b) {
//		return a - b;
//	}

	public static void main(String[] args) {
//		IntBinaryOperator func = Main::sub;
//		int a = func.applyAsInt(5,  3);
//		System.out.println("5-3は" + a);
//
//		IntBinaryOperator func = (int a, int b) -> { return a - b;};
//		int a = func.applyAsInt(5, 3);
//		System.out.println("5-3は" + a);

		FuncList funclist = new FuncList();
		Func1 f1 = FuncList::isOdd;
		Func2 f2 = funclist::addNamePrefix;
		System.out.println(f1.call(15));
		System.out.println(f2.call(true, "Smith"));


//
	}

}
