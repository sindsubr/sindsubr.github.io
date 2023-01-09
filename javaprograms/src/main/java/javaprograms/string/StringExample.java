package javaprograms.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sindsubr
 * 
 *         String is immutable.<br>
 * 
 *         Literals saved in StringPool in java heap memory.<br>
 * 
 *         JVM checks each time when creating String object in memory String
 *         literal is available in heap or not.If it is available it just
 *         returns object reference to increase performance.
 *
 */
public class StringExample {

	public static void main(String[] args) {
		String s1 = "sindu";
		String s2 = "sindu";

		// saves in heap memory not in string pool
		String s3 = new String("sindu");

		// .intern() indicates JVM to check for string literal in string pool
		String s4 = new String("sindu").intern();
		s4.concat("ja");
		System.out.println(s4);// immutable
		System.out.println(s1 == s2); // compares object reference
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println(s2 == s4);

		// mutable,thread safe,poor performance
		StringBuffer sb1 = new StringBuffer("sindu");
		sb1.append(" sabarish");
		System.out.println(sb1);// mutable
		// mutable,good performance
		StringBuilder sbl1 = new StringBuilder("sindu");
		sbl1.append(" sabarish");
		System.out.println(sbl1);// mutable

		List<Object> objectList = new ArrayList<Object>();
		int i = 9;
		objectList.add(i);
		String string1 = "sindu";
		String string2 = "sindu";
		System.out.println("string1 hash" + string1.hashCode());
		System.out.println("string2 hash" + string2.hashCode());
		string2 = "sabi";
		System.out.println("string1" + string1);
		System.out.println("string2" + string2);
		System.out.println("string1 hash" + string1.hashCode());
		System.out.println("string2 hash" + string2.hashCode());
		objectList.add(string1);
		objectList.add(string1);
		System.out.println("EqualsCheck:"+string1 == string2);
		
		String ob1 = (String) objectList.get(1);
		String ob2 = (String) objectList.get(2);
		System.out.println(ob1 == ob2);
		System.out.println(objectList.get(0) == objectList.get(1));
		System.out.println(objectList);

	}

}
