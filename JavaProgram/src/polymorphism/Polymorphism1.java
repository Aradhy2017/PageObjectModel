package polymorphism;

class HillStation {
	void location() {
		System.out.println("Location is :");
	}

	void famousfor() {
		System.out.println("Famous For:");
	}
}

class Manali extends HillStation {
	void location() {
		System.out.println("Location is manali : ");
	}

	void famousfor() {
		System.out.println("Location is manali : ");
	}
}

class Gulmarg extends Manali {
	void location() {
		System.out.println("Location is Gulmarg : ");
	}

	void famousfor() {
		System.out.println("Location is Gulmarg : ");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HillStation h1 = new HillStation();
		h1.famousfor();
		h1.location();
		HillStation M = new Manali();
		M.location();
		M.famousfor();
		HillStation M1 = new Gulmarg();
		M1.famousfor();
		M1.location();

	}

}
