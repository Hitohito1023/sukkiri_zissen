package chapter9;

import java.io.FileReader;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./sample.txt");
		System.out.println("全てのデータ読み込んで表示する");
		int i = fr.read();
		while(i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("");
		System.out.println("ファイルの末尾に到達しました。");
		fr.close();
	}

}
