package assignmentstring;

public class RevrseStringUsingMethod {
	static String str="Priya";
	static String rev(String s1)
	{
		String temp ="";
		for(int i= s1.length()-1;i>=0;i--)
		{
			temp=temp+ s1.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Original String is "+str);
		System.out.println("Reveser string is "+RevrseStringUsingMethod.rev(str));

	}

}
