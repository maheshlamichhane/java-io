package customized.serialization.type.demo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	
	String username="mahesh";
	transient String password="lamichhane";
	
	private void writeObject(ObjectOutputStream os)  throws Exception{
		os.defaultWriteObject();
		String epwd = "123"+password;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
	}

}
