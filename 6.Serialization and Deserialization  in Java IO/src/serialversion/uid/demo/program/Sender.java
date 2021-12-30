package serialversion.uid.demo.program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
		
		Dog1 d1 = new Dog1();
		FileOutputStream fos = new FileOutputStream("serialversionuid.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

	}

}
