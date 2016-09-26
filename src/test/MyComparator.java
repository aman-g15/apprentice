package test;

import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object ob1, Object ob2){
		Price p1 = (Price)ob1;
		Price p2 = (Price)ob2;
		return p1.getValue()-p2.getValue();
	}

}
