package array;

class TestArray1 {
	static int[] getArray() {
		return new int[] { 10, 30, 50, 90, 60 };
	}

	static int getnum() {
		return (10 + 30);
	}
}

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = TestArray1.getArray();
		// printing the values of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
