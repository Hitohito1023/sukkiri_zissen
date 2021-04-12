package chapter3;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ryota");
		names.add("taro");
		names.add("jiro");


		Iterator<String> it = names.iterator();

		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}
