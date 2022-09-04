package stringClass;

public class ReverseString {
	static String s1="Aradhy";
	 static String rev(String str)
	 {
		 String temp ="";
		 for(int i =(str.length())-1;i>=0; i--)
		 {
			 temp = temp +str.charAt(i);
		 }
		 return temp;
	 }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Original String :" +s1);
		System.out.println("Reverse String :" +ReverseString.rev(s1));
	}

}
