package inheritance.serialization.with.only.parent.impl.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		System.out.println(d.legs+"..."+d.speak);
		FileOutputStream fos = new FileOutputStream("inheritance-parent-impl.serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("inheritance-parent-impl.serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1.legs+"..."+d1.speak);

	}

}
