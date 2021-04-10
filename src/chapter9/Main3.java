package chapter9;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
	}

}
