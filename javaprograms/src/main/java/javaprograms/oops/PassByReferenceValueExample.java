package javaprograms.oops;

class Car {
	String color;
	int num;
}

public class PassByReferenceValueExample {

	public static void main(String[] args) {

		Car red = new Car();
		red.color = "red";
		red.num = 100;
		System.out.println("red car color:" + red.color);
		System.out.println(red.num);

		Car white = new Car();
		white.color = "white";
		System.out.println("White car color:" + white.color);
		System.out.println(red.hashCode());
		swap(red, white);
		System.out.println(red.hashCode());
		System.out.println("red car color:" + red.color);
		System.out.println("white car color:" + white.color);
		System.out.println(red.hashCode());
		changeColor(red);
		System.out.println(red.num);
		System.out.println("red car color:" + red.color);
		System.out.println("white car color:" + white.color);
	}

	private static void changeColor(Car car) { //pass by reference
		car.color = "redToBlue";
		car.num = 200;
		System.out.println(car.hashCode());
	}

	public static void swap(Object o1, Object o2) { //pass by value
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		Car r = (Car) o1;
		Car w = (Car) o2;
		Car tmp = r;
		r = w;
		w = (Car) tmp;
	}

}
