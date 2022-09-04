                                                                                                     package assignmentstring;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Concept Of The Day";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
          System.out.println("Original string "+str);
          System.out.println("Reverse String is "+temp);
	}

}
