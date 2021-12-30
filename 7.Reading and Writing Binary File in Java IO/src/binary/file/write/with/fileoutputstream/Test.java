package binary.file.write.with.fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try {
		    // create a writer
		    FileOutputStream fos = new FileOutputStream(new File("katy.jpg"));

		    // write data to file
		    fos.write("Hey, there!".getBytes());
		    fos.write("\n".getBytes());
		    fos.write("How are you doing?".getBytes());

		    // close the writer
		    fos.close();

		} catch (IOException ex) {
		    ex.printStackTrace();
		}

	}

}
