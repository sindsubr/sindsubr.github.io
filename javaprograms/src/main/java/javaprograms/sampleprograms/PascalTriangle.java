package javaprograms.sampleprograms;

import java.util.Scanner;

/**
 * 
 * @author sindu
 * 
 *         Pascal Triangle for fibonacci series
 *
 */
public class PascalTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to draw pascal triangle:");
		int n = in.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n - i; j++) {
//				System.out.print("\t");
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				int fibVal = first + second;
				System.out.print(fibVal + "");
				System.out.print(" ");
				second = first;
				first = fibVal;

			}
			System.out.println();
		}
		System.out.println("\n\n");
		int count = 0;
		for (int i = 0; i < n; i++) {

			int value = (int) Math.pow(11, count);
			System.out.println(value);
			count++;
		}
		System.out.println("\n\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
