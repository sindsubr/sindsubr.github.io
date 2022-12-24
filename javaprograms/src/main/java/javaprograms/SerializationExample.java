package javaprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @author Sinduja
 * 
 *         Serialization in Java is a mechanism of writing the state of an
 *         object into a byte-stream.<br>
 *         It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
 *
 */
class Story implements Serializable {

	/**
	 * The serialization process at runtime associates an id with each Serializable
	 * class which is known as SerialVersionUID. It is used to verify the sender and
	 * receiver of the serialized object. The sender and receiver must be the same.
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * If you don't want to serialize any data member of a class, you can mark it as
	 * transient.
	 * 
	 */

	static String name = "Serialization";// it won't be serialized
	transient int id;
	String content;

	public Story(int id, String content) {
		this.id = id;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Story [id=" + id + ", content=" + content + "]";
	}

}

public class SerializationExample {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		// Serialization

		Story story = new Story(1, "Second story");
		FileOutputStream fout = new FileOutputStream("file.txt");
		/**
		 * The ObjectOutputStream class is used to write primitive data types, and Java
		 * objects to an OutputStream. Only objects that support the
		 * java.io.Serializable interface can be written to streams.
		 */
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(story);
		out.flush();
		out.close();

		// DeSerialization

		System.out.println("success");
		FileInputStream fin = new FileInputStream("file.txt");
		/**
		 * An ObjectInputStream deserializes objects and primitive data written using an
		 * ObjectOutputStream.
		 */
		ObjectInputStream in = new ObjectInputStream(fin);
		Story storyRetrived = (Story) in.readObject();
		System.out.println(storyRetrived);
		in.close();
	}
}
