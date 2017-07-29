package chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteSample {

	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
		for (Integer item : list) {
			System.out.print(item + " " + list.size() + " * ");
			list.add(9);
			System.out.print(list.get(3) + "# - ");
		}
		System.out.println();
		System.out.println("Size: " + list.size());

	}

}
