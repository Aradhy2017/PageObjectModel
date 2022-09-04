package array;

public class M_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 14, 20, 30, 45 }, { 40, 55, 60 }, { 100, 200 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		char[] charArr[] = { { 'a', 'b' }, { 'e', 'c', 'd' }, { 'x', 'y', 'z' } };
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
