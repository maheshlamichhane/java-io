package binary.file.read.with.fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try {
		    // create a reader
		    FileInputStream fis = new FileInputStream(new File("kat.jpg"));

		    // read one byte at a time
		    int ch;
		    while ((ch = fis.read()) != -1) {
		        System.out.print((char) ch);
		    }

		    // close the reader
		    fis.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}

	}

}
