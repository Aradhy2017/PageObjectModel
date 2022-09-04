package polymorphism;

public class Compiletime1 {
	static void sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("sum is " + c);
	}

	static void sum(int e, int f, int g) {
		int c = e + f + g;
		System.out.println("sum is " + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(20, 30);
		sum(10, 20, 30);

	}

}
