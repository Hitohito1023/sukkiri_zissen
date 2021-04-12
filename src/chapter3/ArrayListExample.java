package chapter3;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("ryota");
		names.add("taro");
		names.add("jiro");

		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
