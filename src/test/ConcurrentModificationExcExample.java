package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class ConcurrentModificationExcExample {
	public static void main(String[] args){
		//Map<String, Integer> sort = new HashMap<>();
		Map<String, Integer> sort = new LinkedHashMap<>();
		sort.put("first", 1);
		sort.put("two", 2);
		sort.put("three",3);
		sort.put("four", 4);
		sort.put("five", 5);
		Iterator<String> it = sort.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//sort.put("six", 6);
		}
		Map<WeakClass, Integer> weakMap = new WeakHashMap<>();
		weakMap.put(new WeakClass(), 7);
		weakMap.put(new WeakClass(), 8);
		System.out.println(weakMap.size());
		System.gc();
		System.out.println(weakMap.size());
	}
	
		
	}
 class WeakClass{
}
