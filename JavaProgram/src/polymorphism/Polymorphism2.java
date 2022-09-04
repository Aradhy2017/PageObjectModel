package polymorphism;

class Honda {
	int speedlimit = 200;

	void run1() {
		System.out.println("Honda running");
	}
}

class Bike extends Honda {
	int speedlimit = 100;

	void run1() {
		System.out.println("Bike running");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda B1 = new Bike();
		B1.run1();
		B1.run1();
		System.out.println(B1.speedlimit);

	}

}
