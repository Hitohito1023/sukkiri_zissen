package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Practice1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("sample.txt");
		FileOutputStream fos = new FileOutputStream("text2.txt");
		int i = fis.read();
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fos.flush();
		fos.close();
		fis.close();


	}

}
