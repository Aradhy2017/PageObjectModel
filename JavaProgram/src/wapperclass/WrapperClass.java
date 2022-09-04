package wapperclass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		Integer i = new Integer(a);
		Integer i2 =new Integer(25);
		Integer j =i;
		
		System.out.println("a: "+a+"\ni: "+i+"\ni2: "+i2+"\nj: "+i);  
		
		System.out.println("***Unboxing of boxed object*****");
		Integer intobj = new Integer(25);
		int a2 = intobj.intValue();
		System.out.println(a2);
		System.out.println(intobj == a2);
		System.out.println(intobj.equals(a2));
		

	}

}
