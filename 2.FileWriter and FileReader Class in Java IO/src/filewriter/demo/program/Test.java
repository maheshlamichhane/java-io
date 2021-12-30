package filewriter.demo.program;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("myfile.txt",true);
		writer.write(100);
		writer.write("\nMahesh Lamichhane");
		writer.write("\n");
		char[] chararray = {'A','B','C'};
		writer.write(chararray);
		writer.write("\n");
		writer.flush();
		writer.close();
		

	}

}
