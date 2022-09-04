package scanner;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter character ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch=='a'||ch == 'e'||ch == 'i'||ch =='o'||ch=='u')
		{
			System.out.println("vowel "  +ch);
		}
		else
		{
		System.out.println("consonant " +ch);
		}

   }
}
