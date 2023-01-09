package javaprograms.sampleprograms;

import java.util.Scanner;

/**
 * 
 * @author sindu
 * 
 *         Name or Number after reverse should be same called palindrome
 *
 */
public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check Palindrome or not:");
		String str = in.next();
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println("Your String :" + str);
		System.out.println("Reversed String:" + revStr);

		if (str.compareTo(revStr) == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
