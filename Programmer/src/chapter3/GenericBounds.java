package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericBounds {

	public static class A {}
	
	public interface B {}
	
	public static class C extends A implements B{}
	
	public static void unbound(List<?> list) {
		Object o = list.get(0);
		System.out.println(o);
	}
	
	public static void upperBound(List<? extends B> list) {
		B b = list.get(0);
		System.out.println(b);
	}
	
	public static void lowerBound(List<? super A> list) {
		Object o = list.get(0);
		System.out.println(o);
		list.add(new A());
		list.add(new C());
	}
	
	public static <T> T combined(List<? extends T> list) {
		T t = list.get(0);
		return t;
	}
	
	public static void main(String[] args) {
		List<A> list1 = new ArrayList<>();
		list1.add(new A());
		List<Object> list2 = new ArrayList<>();
		list2.add(new A());
		List<B> list3 = new ArrayList<>();
		list3.add(new C());
		unbound(list1);
		lowerBound(list1);
		unbound(list2);
		lowerBound(list2);
		unbound(list3);
		upperBound(list3);
		
		B b = new C();
		List<? extends B> list5 = Arrays.asList(b);
		//List<? extends B> list5 = new ArrayList<B>();
		unbound(list5);
		upperBound(list5);		
		
		System.out.println(combined(list1));
		System.out.println(GenericBounds.<Object>combined(list1));
	}

}
