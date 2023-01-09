package javaprograms.sampleprograms;

/**
 * 
 * @author sindu
 * 
 * 
 *         Given an array of n numbers. The problem is to move all the 0’s to
 *         the end of the array while maintaining the order of the other
 *         elements. Only single traversal of the array is required.
 * 
 *         Examples: Input : arr[] = {1, 2, 0, 0, 0, 3, 6} Output : 1 2 3 6 0 0
 *         0
 * 
 *         Input: arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9} Output: 1 9 8
 *         4 2 7 6 9 0 0 0 0 0
 * 
 * 
 *         Given a binary array, find the maximum number of consecutive 1s in
 *         this array. Input: [1,1,0,1,1,1] Output: 3 Explanation: The first two
 *         digits or the last three digits are consecutive 1s. The maximum
 *         number of consecutive 1s is 3.
 *
 */
public class TekizmaTwo {

	public static void main(String[] args) {
		int binArr[] = { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		int prevCount = 0;
		int count = 1;
		for (int i = 0; i < binArr.length; i++) {
			if (binArr[i] == 1) {
				count++;
			} else {
				count = 0;
			}

			if (prevCount < count) {
				prevCount = count;
			}
		}
		System.out.println("The maximum consecutive 1's in the given byte array is:"+prevCount);

		int arr[] = { 1, 2, 0, 0, 0, 3, 6 };
//		int arr[] = { 9, 2, 0, 0, 0, 3, 6, 0, 7, 9, 4, 0, 1, 5, 0, 0, 0, 2, 3, 5 };

		int countOfZero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countOfZero++;
			}
		}
		System.out.println(countOfZero);
		int i = 0;
		int num = arr.length - countOfZero;
		for (i = 0; i < num; i++) {
			for (int j = arr.length - 1; j > countOfZero; j--) {
				while(arr[j]==0) {
				j--;
				break;
				}
				if (arr[i] == 0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
		}
		System.out.println("Trailing 0's at last in the array is:");
		for (int n : arr) {
			System.out.print(n);
		}
	}

}
