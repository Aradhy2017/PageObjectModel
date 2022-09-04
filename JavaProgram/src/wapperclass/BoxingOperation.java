package wapperclass;

public class BoxingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int age =20;
          System.out.println("Age :"+age);
          
          Integer Obj=32;
          System.out.println("Implicit Boxing Operation: " +Obj);
          
          Integer intobj =new Integer(age);
          System.out.println("Explicit Boxing Operation :"+intobj);
          System.out.println(age == intobj);
          System.out.println(age == Obj);
          
          Integer intobj2 =new Integer(50);
          System.out.println("Explicit Boxing Operation :"+intobj2);
          
          Integer aa=67;
          System.out.println("Implicit Boxing Opertaion :" +aa);
          
          char c1= 'z';
          Character xyz = c1;
          Character cobj =new Character(c1);
          System.out.println("Explicit Boxing Operation "+cobj);
          System.out.println(c1);
  		  System.out.println(xyz);
  		
          
	}

}
