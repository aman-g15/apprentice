package test;

import java.util.TreeSet;

public class ComparatorTest {
	public static void main(String[] args){
		TreeSet<Price> t = new TreeSet<Price>(new MyComparator());
		t.add(new Price(7));
		t.add(new Price(4));
		t.add(new Price(0));
		t.add(new Price(9));
		System.out.println(t);
	}

}

