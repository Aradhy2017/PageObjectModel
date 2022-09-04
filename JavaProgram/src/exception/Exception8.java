package exception;

public class Exception8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Inside the try block");
			int data =25/5;
//			System.exit(0);
			System.out.println(data);
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
//			int k=25/0;
			System.out.println("I am inside finally block");
			System.out.println("finally block is always executed");
		}

	}

}
