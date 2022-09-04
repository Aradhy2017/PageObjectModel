package loop;

public class Positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive_no p1 = new Positive_no();
		System.out.println("No Is " + p1.positive(-15));
	}

	int positive(int num) {
		if (num > 0) {
			System.out.println("no is Positive " + num);
		} else {
			System.out.println("no is Negaitive " + num);
		}
		return num;
	}

}
