package chapter9;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Practice2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		GZIPOutputStream gzos = null;
		try {
			fis = new FileInputStream("sample.txt");
			FileOutputStream fos = new FileOutputStream("text2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			int i = fis.read();
			while(i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			gzos.flush();
			gzos.close();
			fis.close();
		} catch (IOException e){
			System.out.println("ファイル操作に失敗しました");
			try {
				if(fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			} catch(IOException ee) {}
		}



	}

}
