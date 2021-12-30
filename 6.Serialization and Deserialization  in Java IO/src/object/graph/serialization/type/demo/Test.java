package object.graph.serialization.type.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		FileOutputStream fos = new FileOutputStream("myfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
		

	}

}
