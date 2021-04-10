package chapter9;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main5 {
	public static void main(String[] args) throws IOException {
		String msg = "第1土曜日";
		Reader sr = new StringReader(msg);
		char c1 = (char) sr.read();
		char c2 = (char) sr.read();
	}

}
