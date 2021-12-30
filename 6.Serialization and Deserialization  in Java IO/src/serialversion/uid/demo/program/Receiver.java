package serialversion.uid.demo.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("serialversionuid.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1)ois.readObject();
		System.out.println(d2.i+"..."+d2.j);

	}

}
