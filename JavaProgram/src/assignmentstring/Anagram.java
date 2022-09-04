package assignmentstring;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "Cares";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()==str2.length() )
		{
			char[] strArray1 = str1.toCharArray();
			char[] strArray2 =str2.toCharArray();
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);
			
			boolean result = Arrays.equals(strArray1, strArray2);
			if(result)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
			else
			{
				System.out.println("not anagram");
			}
		}
		
		
	  }
	