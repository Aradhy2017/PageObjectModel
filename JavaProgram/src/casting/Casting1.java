package casting;

public class Casting1 {

	public static void main(String[] args) {
		/* explicit widening */
		int salary = 485975;
		double mysal = (double) salary;
		float myfloat = (float) salary;
		System.out.println("" + mysal);
		System.out.println("" + myfloat);
		/* Implicit widening */
		System.out.println("******************Implicit widening******************");
		int salary1 = 485975;
		double mysal1 = salary1;
		float myfloat1 = salary1;
		System.out.println("" + mysal1);
		System.out.println("" + myfloat1);
		System.out.println("******************Explicit Narrowing******************");

		double saldb = 14527.235d;
		int sala = (int) saldb;
		float flosal = (float) saldb;
		System.out.println("Double to int " + sala);
		System.out.println("Double to int " + flosal);

	}

}
