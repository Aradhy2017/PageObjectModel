package array;

class TestArray {
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min value is " + min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max value is " + max);
	}

}

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 25, 74, 1, 10, 5 };
		TestArray.min(a);
		TestArray.max(a);
	}

}
