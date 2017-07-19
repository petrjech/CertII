package chapter3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionLoop {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three");

		for (String string : list) {
			System.out.println(string);
		}

		@SuppressWarnings("rawtypes")
		Iterator iter1 = list.iterator();
		while (iter1.hasNext()) {
			String string = (String) iter1.next();
			System.out.println(string);
		}

		Iterator<String> iter2 = list.iterator();
		while (iter2.hasNext()) {
			String string = iter2.next();
			System.out.println(string);
		}
	}
}
