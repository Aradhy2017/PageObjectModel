package assignmentstring;

public class FirstReapeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "teeter";
		int count;
		char s1[] =str.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j]&& s1[i] !=' ')
				{
					count++;
					s1[j]='0';
				}
			}
			if(count>1 && s1[i]!='0')
			{
				System.out.println(s1[i]);
			}
		}
		
		

	}

}
