package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 12, 67, 89, 67 };
		double sum = 0;
		double avg = 0;
		for (int num : a) {
			sum = sum + num;

		}
		System.out.println("Length of array is " + a.length);
		int arraylen = a.length;
		avg = sum / arraylen;
		System.out.println("Sum is :" + sum);
		System.out.println("Average is " + avg);

	}

}
