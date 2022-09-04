package scanner;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1;
       int num2;
       Scanner scref=new Scanner(System.in);
       System.out.println("Enter num1 ");
       num1=scref.nextInt();
       System.out.println("Enter num2 ");
       num2 =scref.nextInt();
       char op;
       System.out.println("Enter Operator ");
       op =scref.next().charAt(0);
       System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));
    	System.out.println("*****************************************");
		 System.out.println("Num1 "+num1);
		 System.out.println("Num1 "+num2);
		 System.out.println("Num1 "+op);
		 System.out.println("Num1 "+num1 +num2);
	}
         static int addNumber(char op,int num1,int num2)
         {
        	 if(op=='+')
        	 {
        		 return num1+num2;
        	 }
        	 return 0;
        	 
         }
        
         	
	}

         
