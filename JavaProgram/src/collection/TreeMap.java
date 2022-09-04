package collection;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map m1 =new TreeMapExample();		
		m1.put("key1", "admin");//upcasting
		m1.put("key5", "admin");//upcasting
		m1.put("key3", "admin123");//upcasting
		m1.put("key0", "admin");//upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
	}

}
