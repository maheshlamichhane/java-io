package inheritance.serialization.with.only.child.impl.serializable;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	String speak ="bhow bhow";
	
	public Dog() {
		System.out.println("Dog Class Constructor");
	}
}
