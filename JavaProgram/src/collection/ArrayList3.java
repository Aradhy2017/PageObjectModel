package collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> a1 =new ArrayList<String>();
      a1.add("Ajay");
      a1.add("Vijay");
      a1.add("Arav");
      a1.add("anu");
      a1.add("sachin");
      System.out.println("Remove anu element "+a1.remove("anu"));
      System.out.println(a1);
      System.out.println("Remove emlement using index "+a1.remove(3));
      System.out.println(a1);
      ArrayList<String> a12=new ArrayList<String>();
      a12.add("ABC");
      a12.add("Priya");
      a12.add("Riya");
      a12.addAll(a1);
      System.out.println(a12);
      a1.contains(a12);
      System.out.println(a12);
//      a1.removeIf(str -> str.contains("Ajay"));
      a1.removeIf(str -> str.contains("Ajay"));
      System.out.println(a1);
//      a1.clear();
      a1.removeAll(a1);
      System.out.println(a1);
      System.out.println(a12);
	}

}
