package chapter9;

import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("sample2.txt", true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.out.println("エラーが発生しました");
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e2) {}
			}
		}
	}

}
