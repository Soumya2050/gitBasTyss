package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class Test1 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Object> map = new LinkedHashMap<>();
//		map.put("s", null);
//		map.put('s', null);
		System.out.println(map);
	}
	
	@Test
	public void treeMap() {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("b", 15);
		map.put("a", 10);
		System.out.println(map);
	}
	
	@Test
	public void method2() {
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add("soumya");
		set.add(10);
		set.add('1');
		set.add(null);
		set.add(10);
		set.add(null);
		
		System.out.println(set);
//		for (Object object : set) {
//			System.out.println(object);
//		}
	}
	
}
