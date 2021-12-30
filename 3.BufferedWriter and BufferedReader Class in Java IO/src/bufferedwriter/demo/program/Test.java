package bufferedwriter.demo.program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1 = {'a','b','c','d'};
		bw.write(ch1);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("Software solutions");
		bw.flush();
		bw.close();

	}

}
