package javaprograms.threads;

public class VolatileThreadExample {
	static int count = 0;
//	static volatile boolean boolVal = true;

	public static void main(String args[]) {
		new StaticVolatileThread().start();
		new StaticVolatileThread1().start();
	}

	static class StaticVolatileThread extends Thread {

		@Override
		public void run() {
//			System.out.println(boolVal);
//			if (boolVal) {
//				int local = count++;
				System.out.println(count);
				int x = 0;
				while (x < 5) {
					x++;
					count++;
//					System.out.println("loop inprogress");
				}
//				boolVal = false;
				System.out.println("StaticVolatileThread:"+count);
//			}
		}
	}

	static class StaticVolatileThread1 extends Thread {

		@Override
		public void run() {
//			System.out.println(boolVal);
//			if (boolVal) {
//				int local = count++;
				System.out.println(count);
//				boolVal = false;
				System.out.println("StaticVolatileThread1:"+count);
//			}
		}
	}
}
