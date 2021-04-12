package chapter1;

public class Practice2 {
	public static void main(String[] args) {

		String folder1 = "c:¥javadev";
		String folder2 = "c:¥user¥";

		String file = "readme.txt";

		System.out.println(nameMake(folder1, file));
		System.out.println(nameMake(folder2, file));

	}

	public static String nameMake(String folder, String file) {
		if(!folder.endsWith("¥")) {
			folder += "¥";
		}
		return folder + file;
	}

}
