package javaprograms.threads;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * 
 * @author sindsubr
 * 
 *         Thread is a path for execution.<br>
 * 
 *         Thread states: New,Runnable,Wait/Timely-wait/blocked,Terminated.
 * 
 *         Multithreading refers to a process of executing two or more threads
 *         simultaneously for maximum utilization of the CPU. A thread in Java
 *         is a lightweight process requiring fewer resources to create and
 *         share the process resources.<br>
 * 
 *         Synchronization is the process of controlling other thread access
 *         when execution of current thread.
 *
 */

public class EvenOrOddAndSwapNoMultithreading {

	static Logger logger = Logger.getLogger(EvenOrOddAndSwapNoMultithreading.class.getName());
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) throws InterruptedException {

		logger.info("EvenOrOddAndSwapNoMultithreading started");
		long start = System.nanoTime();
		System.out.println(start);
		EvenOrOdd task1 = new EvenOrOdd();
		task1.setNumber(10 + 20);
		task1.evenOddCheck();
		
		Swapping task2 = new Swapping();
		task2.setN1(10);
		task2.setN2(20);
		task2.swap();
		long end = System.nanoTime();
		System.out.println(end);
		long timeTaken = end - start;
		logger.info("Time taken for execution:" + TimeUnit.MILLISECONDS.toSeconds(timeTaken));

//Multithreading

		logger.info("EvenOrOddAndSwap with Multithreading  started");
		long start1 = System.nanoTime();
		System.out.println(start1);
		EvenOrOdd taskThread1 = new EvenOrOdd();
		taskThread1.setNumber(10 + 20);
		EvenOrOdd taskThread3 = new EvenOrOdd();
		taskThread3.setNumber(1+3);
		
		Swapping taskThread2 = new Swapping();
		taskThread2.setN1(10);
		taskThread2.setN2(20);

		Thread thread1 = new Thread(taskThread1);
		System.out.println("Thread1:" + thread1.getState());
		thread1.start();
		thread1.isAlive();
		Thread thread3 = new Thread(taskThread3);
		System.out.println("Thread3:" + thread3.getState());
		thread3.start();
		System.out.println("Thread3:" + thread3.getState());

		Thread thread2 = new Thread(taskThread2);
		System.out.println("Thread2:" + thread2.getState());
		thread2.start();
		thread2.isAlive();
		System.out.println("Thread1:" + thread1.getState());
		System.out.println("Thread2:" + thread2.getState());
//		Thread.sleep((long) 0.0001);
		System.out.println("Thread1:" + thread1.getState());
		System.out.println("Thread2:" + thread2.getState());

		long end1 = System.nanoTime();
		System.out.println(end1);

		long timeTaken1 = end1 - start1;
		logger.info("Time taken for execution:" + TimeUnit.MILLISECONDS.toSeconds(timeTaken1));
		long timeDiff = timeTaken - timeTaken1;
		long time = TimeUnit.MILLISECONDS.toSeconds(timeDiff);

		System.out.println("Time Difference for Normal execution and Multithreading:" + time);
	}

}

class EvenOrOdd extends Thread {
	int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	synchronized void evenOddCheck() {
		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		for (int i = 0; i <= 20; i++) {
			System.out.println("count" + i);
		}
	}

	public void run() {
		evenOddCheck();
	}

}

class Swapping extends Thread {
	int n1;
	int n2;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	void swap() {
		System.out.println("Before Swapping");
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After Swapping");
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
	}

	public void run() {
		swap();
	}
}