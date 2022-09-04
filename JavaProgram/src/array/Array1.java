package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		System.out.println("Before Initialization");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("\"*********After Initialization\"*********");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("Count the elements of array " + a.length);

		System.out.println("*********By using for loop**************");
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

		System.out.println("**************for-each loop*************");
		for (int num : a) {
			System.out.println(num);
		}

		char ab[] = new char[] { 'A', 'B', 'C', 'D', 'E' };

		System.out.println("**************for-each loop*************");
		for (char num : ab) {
			System.out.println(num);
		}

		System.out.println("**************for loop*************");
		for (int j = 0; j < 5; j++) {
			System.out.println(a[j]);

		}
		for (int j = 0; j < 5; j++) {

			System.out.println(ab[j]);

		}

	}

}
