package abstract12;
abstract class Shape {
	abstract void draw();
}
// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	protected void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

public class Abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle1();
		s.draw();	
		Shape s1 = new Rectangle();
		s1.draw();
	}

}
