package methodOverloading;

public class MethodOverloading3 {
	public double myMethod11(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return num1+num2;
	   }
	   public int myMethod1(int var1, int var2)
	   {
	      System.out.println("Second myMethod of class Demo");
	      return var1-var2;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverloading3 obj2= new MethodOverloading3();
	      obj2.myMethod11(10,10);
	      obj2.myMethod11(20,12);
	}

}
