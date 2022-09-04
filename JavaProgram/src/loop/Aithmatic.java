package loop;

public class Aithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int y = 20;
		int z = x + y;
		System.out.println("Addition of Z is " + z);
		System.out.println("add is " + sum(45, 50));
		System.out.println("add is " + mult(4.5f, 5.0f));
	}

	static int sum(int x, int y) {
		int z;
		z = x + y;
//		System.out.println("z is" +z);
		return z;
	}

	static float mult(float x, float y) {
		float z;
		z = x * y;
		return z;
	}

}
