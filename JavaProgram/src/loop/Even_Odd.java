package loop;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("no is Even" + i);
			} else {
				System.out.println("no is Odd " + i);
			}
		}
		System.out.println("  " + even(10));

	}

	static int even(int j) {
		for (int i = 1; i <= j; i++) {
			if (i % 2 == 0) {
				System.out.println("Even no " + i);
			} else {
				System.out.println("odd no " + i);
			}

		}
		return j;
	}

}
