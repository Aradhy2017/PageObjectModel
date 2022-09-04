package assignment.array;
class Big
{
	static void max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
public class Largearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,85,90,87,0};
		Big.max(a);
		
	}

}
