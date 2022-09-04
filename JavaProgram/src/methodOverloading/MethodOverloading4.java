package methodOverloading;
/**
 * what if return type, method name and argument list are same.-- compile time error
 */
public class MethodOverloading4 {
	 public int myMethod21(int num1, int num2)
	   { 
	       System.out.println("First myMethod of class Demo");
	       return num1+num2;
	   }
	   public int myMethod21(int var1, int var2)
	   {
	       System.out.println("Second myMethod of class Demo");
	       return var1-var2;
	   }

	   public static void main(String args[])
	   {
	       MethodOverloading4 obj1= new MethodOverloading4();
	       obj1.myMethod21(10,10);
	       obj1.myMethod21(20,12);
	   }
	}

	


