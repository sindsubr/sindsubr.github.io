package javaprograms.java8;

import java.util.ArrayList;
import java.util.List;

class Objects {

	String item;
	int itemNum;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public Objects(String item, int itemNum) {
		this.item = item;
		this.itemNum = itemNum;
	}

}

public class Java8CollectionExample {

	public static void main(String[] args) {
		List<Objects> objectList = new ArrayList<>();
		objectList.add(new Objects("Bat", 0));
		objectList.add(new Objects("Ball", 0));
		objectList.add(new Objects("Apple", 0));
		objectList.add(new Objects("Banana", 0));
		objectList.add(new Objects("Cat", 0));
		objectList.add(new Objects("Cabbage", 0));
		objectList.add(new Objects("Asparagus", 0));

		// map(function)
		// filter
		// anymatch(predicate)
		
		// limit
		// collect()
		// sort()
		//max
		//min

		objectList.stream().map(x -> x.getItem().toUpperCase())
		.filter(x -> x.startsWith("B")).forEach(x->{
			System.out.print(x+" ");
		});
		boolean y = objectList.stream().map(x -> x.getItem().toUpperCase())
			.filter(x -> x.startsWith("B")).anyMatch(x->x.endsWith("T"));
		System.out.println(y);
		
	}

}
