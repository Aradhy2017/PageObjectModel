package polymorphism;

class car {
	void run() {
		System.out.println("running");
	}
}

class Innova extends car {
	void run() {
		System.out.println("Innova running");
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new Innova();
		c1.run();
	}

}
