package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {
	
	public static class EasyComparable implements Comparable<EasyComparable> {
		public String attr;
		public EasyComparable(String attr) {
			this.attr = attr;
		}
		@Override
		public int compareTo(EasyComparable o) {
			return this.attr.compareTo(o.attr);
		}
	}
	
	public static class ComplexComparable<T extends Comparable<T>> implements Comparable<ComplexComparable<T>> {
		public T attr;
		public ComplexComparable(T t) {
			this.attr = t;
		}
		@Override
		public int compareTo(ComplexComparable<T> other) {
			return this.attr.compareTo(other.attr);
		}
		@Override
		public String toString() {
			return attr.toString();
		}
	}
	
	public static void main(String[] args) {
		
		List<EasyComparable> easy = new ArrayList<>();
		easy.add(new EasyComparable("two"));
		easy.add(new EasyComparable("five"));
		Collections.sort(easy);
		easy.forEach((EasyComparable a) -> System.out.println(a.attr));		
		
		List<ComplexComparable<String>> list = new ArrayList<>();
		list.add(new ComplexComparable<String>("one"));
		list.add(new ComplexComparable<String>("four"));
		Collections.sort(list);
		list.forEach(a -> System.out.println(a));
	}
}
