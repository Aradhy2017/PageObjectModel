package exception;

import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try
        {
        System.out.println("Enter Array Size ");
        int size=sc.nextInt();
        int empId[]=new int[3];
        System.out.println("You are inside try block...");
		System.out.println(empId[3]);// ArrayIndexOutOfBoundsException
		System.out.println("Try block ends here...");
        }
		catch (Throwable e) {
			System.out.println("catch block starts from here..");
			System.out.println("Exception handled.." + e);
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("catch block ends from here..");
		}
	
		System.out.println("Programs ends here...");
	}
}

	

        
