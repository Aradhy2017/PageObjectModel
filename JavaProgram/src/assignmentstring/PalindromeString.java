package assignmentstring;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "ABA";
        String temp ="";
        for(int i =str.length()-1;i>=0;i--)
        {
        	temp =temp + str.charAt(i);
        }
        System.out.println("Original string "+str);
        System.out.println("Reve string is "+temp);
        if(temp.equals(str))
        {
        	System.out.println("Palindrom");
        }
        else
        {
        	System.out.println("Not palindrom");
        }
        
        
	}   

}
