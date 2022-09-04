package stringClass;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am from Maharashatra,I am workig in Accenture, I working as QA Deleivery Hea";
        System.out.println("Actual String " +s1);
        String arr[] =s1.split(" ");
        for(String a :arr)
        {
        	System.out.println(a);
        }
        
        System.out.println("***************************");
		String s2="I am from UP";
		System.out.println("Actual String: "+s2);
		String arr1[] = s2.split( " ", 4);
		for(String aa :arr1)
		{
			System.out.println(aa);
		}
		
		System.out.println("***************************");
		String s3="I am from Pune";
		System.out.println("Actual String: "+s3);
		String arr2[]=s3.split(" ");
		for(String aaa :arr2)
		{
			System.out.println(aaa);
		}
		System.out.println("************Revrse String****************");
		
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.println(arr2[i]);
		}
		
		String s4="     I am shailesh         ";
		System.out.println("Actual String with spaces: "+s4);
		System.out.println("Actual String length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String length without spaces: "+s4.trim().length());
		System.out.println("Actual String length without spaces: "+s4.trim().length());
		System.out.println("***************************");
		String s5="I    am             shailesh";
		System.out.println("Actual String with spaces: "+s5.trim());
		System.out.println("Actual String length: "+s5.trim().length());
	}
}


