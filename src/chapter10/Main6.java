package chapter10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main6 {
	public static void main(String[] args) throws Exception {
		Employee tanaka = new Employee();
		tanaka.name = "田中一郎";
		tanaka.age = 41;
		Department soumu = new Department();
		soumu.name = "総務部";
		soumu.leader = tanaka;
		FileOutputStream fos = new FileOutputStream("./company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(soumu);
		oos.flush();
		oos.close();
	}

}
