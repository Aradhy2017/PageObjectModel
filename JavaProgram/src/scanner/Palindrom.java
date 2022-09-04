package scanner;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	   System.out.println("enter no");
	   int no=sc.nextInt();
	   int sum=0,temp,r;
	   temp=no;
	   while(no > 0)
	   {
		   r=no % 10;
		   sum = (sum *10)+ r;
		   no=no/10;
		   
	   }
	   if(temp==sum)
	   {
		   System.out.println("Palindrome no");
	   }
	   else
	   {
		   System.out.println("Not Palindrome no");
	   }
	}
}
