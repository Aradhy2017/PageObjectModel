package abstract12;
interface Printable1 {
	 void print();
}
interface Showable1 {
	void print();
}
class Interface6 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Interface6 obj = new Interface6();
		obj.print();
		Showable1 obj1 = new Interface6();
		obj1.print();
		Printable1 obj2 = new Interface6();
		obj2.print();
	}
}

