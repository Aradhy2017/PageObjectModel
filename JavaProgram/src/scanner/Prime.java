package scanner;

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num % i==0)
			{
				count++;
				break;
				}
			}
			if(count==0)
			{
				System.out.println("Prime no");
			}
			else
			{
				System.out.println("Not prime no");
			}
			
	      
	      
		}

	}

			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		