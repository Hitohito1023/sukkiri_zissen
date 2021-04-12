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

		ArrayList<Integer> points = new ArrayList<Integer>();
		System.out.println(points.add(399));
		points.add(333);
		points.add(899999);

		for(int i : points) {
			System.out.println(i);
		}
	}

}
