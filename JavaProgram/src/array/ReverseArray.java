package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {14,95,42,25,32};
         System.out.println("Print Original array");
         for(int i=0;i<a.length;i++)
         {
        	  System.out.println(a[i]);
         }
         System.out.println("**************Print Reverse array****************");
         for(int i=a.length-1;i>=0;i--)
         {
        	 System.out.println(a[i]);
         }
	}

}
