package chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMerge {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(0, null);
		map.put(10, "desitka");
		map.put(20, "dvacitka");
		map.put(100, "stovka");
		System.out.println(map);
		
		BiFunction<String, String, String> bf = (oldValue, newValue) -> oldValue.length() < newValue.length() ? oldValue : newValue;
		map.merge(Integer.valueOf(20), "dvacet", bf );
		System.out.println(map);
		
		map.merge(30, "tricitka", (a, b) -> {System.out.println("in merge"); return "merged";});
		System.out.println(map);
		
		map.merge(0, "nula", (a, b) -> {System.out.println("in merge"); return "merged";});
		System.out.println(map);
		
		map.merge(10, "xxx", (a, b) -> {System.out.println("in merge"); return null;});
		System.out.println(map);
		
		map.put(0, null);
		map.merge(0, "xxx", (a, b) -> {System.out.println("in merge"); return null;});
		System.out.println(map);
	}

}
