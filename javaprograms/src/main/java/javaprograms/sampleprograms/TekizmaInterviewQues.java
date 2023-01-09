package javaprograms.sampleprograms;

import java.util.Arrays;

/**
 * 
 * @author sindu
 * 
 *         Two Strings : anagram
 * 
 *         Dog God
 *
 */
public class TekizmaInterviewQues {

	public static void main(String args[]) {

		String s1 = "das"; // dng
		String s2 = "asd";

		char[] s1CharArray = s1.toLowerCase().toCharArray();
		char[] s2CharArray = s2.toLowerCase().toCharArray();
		Arrays.sort(s1CharArray);
		Arrays.sort(s2CharArray);

		String charS1 = String.valueOf(s1CharArray);
		String charS2 = String.valueOf(s2CharArray);
		System.out.println(charS1);
		System.out.println(charS2);

		if (charS1.contentEquals(charS2)) {
			System.out.println("Strings are Anagram");
		} else {

			System.out.println("Strings are not Anagram");
		}

	}

}
