package chapter9;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("./sample3.txt", true);
		
		fw.write('A');
		fw.flush();
		fw.close();
	}

}
