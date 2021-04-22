package chapter10;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main5 {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("./pref.properties");
		Properties p = new Properties();
		p.load(fr);
		String aichiCapital = p.getProperty("aichi.capital");
		String aichiFood = p.getProperty("aichi.food");
		System.out.println(aichiCapital + ":" + aichiFood);
		fr.close();
	}

}
