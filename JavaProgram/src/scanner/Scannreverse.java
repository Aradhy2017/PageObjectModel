package scanner;

import java.util.Scanner;

public class Scannreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter no");
       int no=sc.nextInt();
       int rev=0,remin;
       while(no != 0)
       {
    	   remin =no % 10;
    	   rev = (rev * 10)+remin;
    	   no = no/10;
       }
       System.out.println("REverse no is : "+rev);
	}

}
