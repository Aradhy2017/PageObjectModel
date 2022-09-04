package wapperclass;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Double doubleobj=25.54;
         System.out.println(doubleobj);
         
         double salary =doubleobj.doubleValue();      //Unboxing
         System.out.println(salary);
         System.out.println(doubleobj == salary);
         
         Boolean b=true;
         boolean A =b.booleanValue();           //Unboxing
         
         Character c1 =new Character('a');
         char c2 = c1.charValue();      //Unboxing
         
         Integer i=25;
         double i2 = i.intValue();      //Unboxing
         System.out.println(i2);
         
         
	}

}
