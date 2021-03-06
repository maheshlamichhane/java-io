package externalization.program.for_handling.serialization.flow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ExternalizableDemo demo = new ExternalizableDemo("Mahesh",27,484398);
		System.out.println(demo.name+"..."+demo.age+"..."+demo.phone);
		
		FileOutputStream fos = new FileOutputStream("external.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		
		FileInputStream fis = new FileInputStream("external.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		ExternalizableDemo demo2 = (ExternalizableDemo) ois.readObject();
		
		System.out.println(demo2.name+"..."+demo2.age+"..."+demo2.phone);
		
		

	}

}
