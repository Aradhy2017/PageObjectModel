package stringClass;

public class PalindromStr {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABAd";
	   
        String temp ="";
	 
			for(int i=str.length()-1;i>=0;i--)
			{
				temp=temp+str.charAt(i);
			}
			if(temp.equals(str))
			{
				System.out.println("Palindrome string");
			}
			else
			{
				System.out.println(" Not Palindrome string");
			}
			return;
			
		}
	}


