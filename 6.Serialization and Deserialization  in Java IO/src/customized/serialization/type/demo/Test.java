package customized.serialization.type.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Account account = new Account();
		System.out.println(account.username+"..."+account.password);
		
		FileOutputStream fos = new FileOutputStream("customize.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		
		FileInputStream fis = new FileInputStream("customize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a = (Account)ois.readObject();
		System.out.println(a.username+"..."+a.password);

	}

}
