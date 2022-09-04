package casting;

class Sample {
	void test1(double d) {
		System.out.println("d value=" + d);
	}

	void test1(int k) {
		System.out.println("k value=" + k);
	}
}

public class Casting2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program starts");
		Sample s = new Sample();
		s.test1(7.0);
		System.out.println("Program ends");
	}

}
