package simple.file_class.program;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("abc.txt");
//		System.out.println(file.exists());
//		file.createNewFile();
//		System.out.println(file.exists());
		
		File file = new File("abc.txt");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
		System.out.println(file.isFile());
		

	}

}
