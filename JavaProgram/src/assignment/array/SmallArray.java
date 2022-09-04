package assignment.array;
class Small
{
	static void min(int arr[])
	{
		int min= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}
}
public class SmallArray {

	private static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,85,101};
         Small.min(a);
	}

}
