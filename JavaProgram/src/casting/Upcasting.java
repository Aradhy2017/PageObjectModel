package casting;

class Pune {
	void Deccan() {
		System.out.println("Here is Deccan");
	}
}

class Mumbai extends Pune {
	void kurla() {
		System.out.println("Here is kurla");
	}
}

public class Upcasting extends Mumbai {
	void city() {
		System.out.println("Upcasting City");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting up = new Upcasting();
		up.city();
		Mumbai M1 = new Upcasting();
		M1.Deccan();
		Mumbai m2 = up;// auto upcasting or implicit upcasting
		Pune p1 = new Upcasting();// auto upcasting or implicit upcasting
		Pune p2 = up;// auto upcasting or implicit upcasting
		Mumbai m3 = (Mumbai) new Upcasting();// explicit upcasting

		Mumbai m5 = (Mumbai) new Upcasting();
//		m5.city();
		Pune p3 = new Mumbai();
		Pune p4 = (Pune) new Mumbai();

	}

}
