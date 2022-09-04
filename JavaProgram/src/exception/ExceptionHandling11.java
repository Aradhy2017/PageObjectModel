package exception;

public class ExceptionHandling11 {
	public static void validateAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Person is not Eligible");
		}
		else
		{
			System.out.println("Person is elligible");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validateAge(17);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled...");
    		System.out.println(e);
		}
		
		

	}

}
