package scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello,Welcome java";
		Scanner sc=new Scanner(s);
		System.out.println("Boolean Result is :"+sc.hasNext());
		System.out.println("Print String " +sc.nextLine());
		System.out.println("Enter Details :");
		Scanner in =new Scanner(System.in);
		String name =in.next();
		System.out.println("Enter age ");
		int age =in.nextInt();
		System.out.println("Enter Salary ");
		double salary=in.nextDouble();
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+salary);
		
		
		
		
        
	}

}
