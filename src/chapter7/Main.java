package chapter7;

import java.util.Iterator;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		System.out.println("ご利用中のJavaのバージョン：");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("【システムプロパティ一覧】");
		while(i.hasNext()) {
			String key = i.next();
			System.out.println(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}
}
