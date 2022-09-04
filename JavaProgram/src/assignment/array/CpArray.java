package assignment.array;

import java.util.Arrays;

public class CpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		a[0]=29;
		a[1]=45;
		a[2]=100;
		System.out.println("The length of array is "+a.length);
		for(int i: a)
		{
//			System.out.println(i);
		}
		int[] b =Arrays.copyOf(a, a.length);
		for(int j :b)
		{
			System.out.println("Copy of array is "+j);
		}

	}

}
