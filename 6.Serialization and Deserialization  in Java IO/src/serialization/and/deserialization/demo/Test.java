package serialization.and.deserialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog g = new Dog();
		Cat c = new Cat();
		Rat r = new Rat();
		FileOutputStream fos = new FileOutputStream("abc.txt");  //serialization
		ObjectOutputStream oos = new ObjectOutputStream(fos);	 //serialization
		oos.writeObject(g);										 //serialization
		oos.writeObject(c);
		oos.writeObject(r);
		
		FileInputStream fis = new FileInputStream("abc.txt");    //deserialization
		ObjectInputStream ois = new ObjectInputStream(fis);		 //deserialization
		Dog g1 = (Dog) ois.readObject();						 //deserialzation
		Cat c1 = (Cat) ois.readObject();
		Rat r1 = (Rat) ois.readObject();
		System.out.println(g1.i+" "+g1.j);
		System.out.println(c1.voice);
		System.out.println(r1.voice);
	}

}
