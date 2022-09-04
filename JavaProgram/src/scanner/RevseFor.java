package scanner;

import java.util.Scanner;

public class RevseFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		num = sc.nextInt();
		
		for(;num != 0; num=num/10)
		{
			rem=num%10;
			rev = (rev*10)+rem;
		}
		System.out.println("Reverse no is "+rev);

	}

}
