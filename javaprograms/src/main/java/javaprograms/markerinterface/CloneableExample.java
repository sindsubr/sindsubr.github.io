package javaprograms.markerinterface;

/**
 * 
 * @author sindsubr
 * 
 *         Cloneable Interface in Java is a marker interface.<br>
 *         It belongs to java.lang package. It is used to create a clone or copy
 *         of an object with some other name.<br>
 *         If we want to clone the objects of a class, then that class has to
 *         implement the Cloneable interface.<br>
 *         This is used to indicate the JVM that the clone() method of the
 *         Object class can be used by the objects of the class which have
 *         implemented the Cloneable Interface.
 *
 */
public class CloneableExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Creating an object
		Plant p1 = new Plant("Tree", 10, 100);
		System.out.println("Plant p1: " + p1);

		// Creating clone of the object p1
		Plant p2 = (Plant) p1.clone();
		System.out.println("Clone of p1: " + p2);
	}

}

class Plant implements Cloneable {

	String name;
	int height;
	int leaves;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Plant(String s, int h, int l) {
		name = s;
		height = h;
		leaves = l;
	}

	public String toString() {
		return "Name: " + name + ", Height: " + height + ", Leaves: " + leaves;
	}

}
