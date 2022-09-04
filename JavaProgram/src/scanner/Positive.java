package scanner;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int no;
        System.out.println("Enter no");
        no=sc.nextInt();
        if(no>0)
        {
        	System.out.println("Positive");
        }
        else
        {
        	System.out.println("Negative");
        }
        
	}

}
