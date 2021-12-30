package filereader.simple.program;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("myfile.txt");
		FileReader rd2 = new FileReader(file);
		char[] ch = new char[(int)file.length()];
		rd2.read(ch);
		for(char ch1: ch) {
			System.out.println("From read char array="+ch1);
		}
		rd2.close();
		
		FileReader rd = new FileReader("myfile.txt");
		int i = rd.read();
		while(i != -1) {
			System.out.println("From read="+(char)i);
			i = rd.read();
		}
		rd.close();
		

	}

}
