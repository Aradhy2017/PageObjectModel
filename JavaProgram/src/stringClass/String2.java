package stringClass;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1 ="DhanoriPune";
         char c =str1.charAt(2);
         System.out.println("Char at index 2: " +c);
         
      // to print one by one character of string
         for(int i=0;i<str1.length();i++)
         {
        	 System.out.println(str1.charAt(i));
         }
         System.out.println("*****************************");
         // to print reverse one by one character of string
         for(int i=str1.length()-1;i>0;i--)
         {
        	 System.out.println(str1.charAt(i));
         }
         System.out.println("*****************************");
         String temp ="";
         for(int i=str1.length()-1; i>= 0 ;i--)
        	 
         {
        	 temp= temp +str1.charAt(i);
         }
         System.out.println("str1: " + str1);
 		 System.out.println("temp: " + temp);
 		 
 		
 		 
	}

}
