package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {

	public static class MyComp {
		public String name;
		public Integer id;
		
		public MyComp(String name, Integer id) {
			this.name = name;
			this.id = id;
		}
		
		public static Comparator<MyComp> nameComparator = (a, b) -> a.name.compareTo(b.name);
		
		public static Comparator<MyComp> idComparator = (MyComp a, MyComp b) -> a.id.compareTo(b.id);
		
		@Override
		public String toString() {
			return name + " - " + id;
		}
		
	}
	public static void main(String[] args) {
		
		List<MyComp> list = new ArrayList<>();
		list.add(new MyComp("one", 1));
		list.add(new MyComp("four", 4));
		Collections.sort(list, MyComp.nameComparator);
		list.forEach(System.out::println);
		Collections.sort(list, MyComp.idComparator);
		list.forEach(System.out::println);
		Collections.sort(list, MyComp.idComparator.reversed().thenComparing(MyComp.nameComparator.reversed()));
		list.forEach(System.out::println);
	}

}
