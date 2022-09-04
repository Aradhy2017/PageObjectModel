package exception;

import java.util.Scanner;

public class Exaception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			int i,j,k;
			System.out.println("Enter i :");
			i=sc.nextInt();
			System.out.println("Enter j :");
			j = sc.nextInt();
			k=i/j;
			System.out.println("Value of k is: "+k);
		    }
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}
		System.out.println("Programs ends here...");
		
		
		

	}

}
