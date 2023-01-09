package javaprograms.sampleprograms;

public class PrimeOrComposite {

	public static void main(String[] args) {
		int num = 100;
		boolean flag = false;
		for (int n = 2; n <= num; n++) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.print(n + " ");
			}
			flag = false;
//			if (flag) {
//				System.out.println("Composite");
//			} else {
//				System.out.println("Prime");
//			}
		}

	}

}
