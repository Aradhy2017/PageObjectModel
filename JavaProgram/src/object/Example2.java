package object;

class Demo1 {
	void display() {
		System.out.println("I am display of class Demo1 ");
	}

}

public class Example2 extends Demo1 {
	static int last_roll = 200;
	int roll_no;

	Example2() {
		roll_no = last_roll;
		last_roll++;
	}

	@Override
	void display() {
		System.out.println("I am display of class Example2 ");
	}

	public int hashcode() {
		return roll_no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 s = new Example2();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashcode());
		s.display();
		Demo1 d1 = new Demo1();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());

	}

}
