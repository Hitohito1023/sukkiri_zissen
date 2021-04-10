package chapter9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Practice {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("test1.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();


	}

}
