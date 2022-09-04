package exception;

public class Exception9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  System.out.println("Inside try block");
    	  int k=45/0;
    	  System.out.println(k);
      }
      catch(ArithmeticException e)
      {
    	  System.out.println("Exception handled");
		  System.out.println(e);
      }
      finally
      {
    	  System.out.println("finally block is always executed");
      }
          System.out.println("rest of the code...");
	}

}
