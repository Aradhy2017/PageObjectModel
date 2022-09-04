package object;

class Demo {
	void display() {
		System.out.println("Display Here ");
	}
}

public class Example1 extends Demo {
	static int last_roll = 100;
	int roll_no;

	Example1() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1 = new Example1();
		e1.display();
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		Demo d2 = new Example1();
		System.out.println(d2);
		System.out.println("roll no is " + last_roll);

	}

}
