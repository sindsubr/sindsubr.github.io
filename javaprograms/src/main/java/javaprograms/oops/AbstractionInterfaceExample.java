package javaprograms.oops;

interface I {
	void call();
	default void defaultNormal() {
		System.out.println("interface normal method impl allowed");
	}
}

abstract class A {
	abstract void call();
	 void normal() {
		System.out.println("abstract normal method impl allowed");
	}

}

public class AbstractionInterfaceExample extends A implements I{

	public static void main(String[] args) {
		AbstractionInterfaceExample ob = new AbstractionInterfaceExample();
		ob.call();
		ob.normal();
		ob.defaultNormal();	
	}

	@Override
	public void call() {
		System.out.println("called");
	}
	@Override
	public void normal() {
		System.out.println("called");
	}

}
