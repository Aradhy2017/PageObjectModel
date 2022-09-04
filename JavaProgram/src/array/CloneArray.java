package array;

import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 15, 20, 25 };
		System.out.println("Printing original array:");
		for (int no : array) {
			System.out.println(no);
		}
		System.out.println("Printing clone of array");
		int clonearray[] = array.clone();
		for (int j : clonearray) {
			System.out.println(j);
		}
		System.out.println("Are both equal arr & carr ?");
		Arrays.equals(array, clonearray);
		System.out.println(Arrays.equals(array, clonearray));
		int newcopied[] = Arrays.copyOf(array, clonearray.length);
		for (int i : newcopied) {
			System.out.println(i);
		}
		System.out.println("*************Copy range*****************");
		int newcopiedrange[] = Arrays.copyOfRange(array, 0, 3);
		for (int i : newcopiedrange) {
			System.out.println(i);
		}
		System.out.println("compare newcpied and newcopiedrange " + Arrays.equals(newcopied, newcopiedrange));
		System.out.println("**************************");
		Arrays.sort(array);
		System.out.println("After sorting original array:");
		for (int i : array) {
			System.out.println(i);
		}

	}

}
