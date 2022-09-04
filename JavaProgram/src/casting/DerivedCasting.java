package casting;

class Parent {
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}

	void callme() {
		System.out.println("Parent callme method is called");
	}
}

class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}

public class DerivedCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************Ref and Object both of child*********************");
		// Object of Child class and reference of child class
		Child c1 = new Child();
		c1.readme();
		c1.callme();
		c1.show();
		System.out.println("****************Ref and Object both of Parent*********************");
		// Object of Parent class and reference of Parent class
		Parent p1 = new Parent();
		p1.show();
		p1.callme();
		System.out.println("****************Ref parent and Object child*********************");
		Parent p2 = new Child();
//		p2.readme();
		p2.callme();
		p2.show();

	}

}
