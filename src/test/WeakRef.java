package test;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakRef {
	public static void main(String[] args){
		
		Map<Order, Integer> weakMap = new WeakHashMap<>();
		weakMap.put(new Order(3), 7);
		weakMap.put(new Order(4), 8);
		System.out.println(weakMap.size());
		System.gc();
		System.out.println(weakMap.size());
	}

}
class Order{
	int size;
	public Order(int size){
		this.size=size;
	}
}
