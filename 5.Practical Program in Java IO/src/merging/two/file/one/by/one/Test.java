package merging.two.file.one.by.one;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		
		String s1 = br1.readLine();
		while(s1 != null) {
			pw.println(s1);
			s1=br1.readLine();
		}
		
		String s2 = br2.readLine();
		while(s2 != null) {
			pw.println(s2);
			s2=br2.readLine();
		}
		
		pw.flush();
		pw.close();
		br1.close();
		br2.close();
		
		
		

	}

}
